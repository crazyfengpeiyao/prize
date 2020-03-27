package com.luck.prize.service.impl;

import com.google.gson.JsonArray;
import com.luck.prize.bean.MeetingPrizeBean;
import com.luck.prize.bean.MeetingUserBean;
import com.luck.prize.mapper.MeetingPrizeMapper;
import com.luck.prize.mapper.MeetingUserMapper;
import com.luck.prize.service.MeetingUserService;
import information.exception.ExceptionCode;
import information.exception.SystemException;
import information.utils.GsonUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Classname MeetingUserServiceImpl
 * @Date 2019/12/10 10:28
 * @Created by fengpeiyao
 * @Copyright &copy CAUCHINA
 * @Description TODO
 */
@Service("meetingUserService")
public class MeetingUserServiceImpl implements MeetingUserService {


    private Logger logger = LogManager.getLogger(MeetingUserServiceImpl.class);

    @Autowired
    private MeetingUserMapper meetingUserMapper;

    @Autowired
    private MeetingPrizeMapper meetingPrizeMapper;


    public List<MeetingUserBean> getUser() throws SystemException {
        List<MeetingUserBean> meetingUserBeanList = null;
        try {
            meetingUserBeanList = meetingUserMapper.selectUser();
            if (meetingUserBeanList != null) {
                List<MeetingUserBean> noUserImgList = new ArrayList<MeetingUserBean>();
                Random random = new Random();
                for (MeetingUserBean user : meetingUserBeanList) {
                    String image = user.getImage();

                    if (image == null || "".equals(image)) {
                        noUserImgList.add(user);
                    }
                }
                meetingUserBeanList.removeAll(noUserImgList);

                List<MeetingUserBean> generateUserImgList = new ArrayList<MeetingUserBean>();
                if (noUserImgList != null && noUserImgList.size() > 0){
                    for (int i =0 ;i < noUserImgList.size() ;i ++){
                        MeetingUserBean meetingUserBean = noUserImgList.get(i);
                        int index = random.nextInt(5)+1;
                        String image = "/static/img/tx" + index + ".png";
                        String thumbImage = "/static/img/tx" + index + ".png";
                        meetingUserBean.setImage(image);
                        meetingUserBean.setThumb_image(thumbImage);
                        generateUserImgList.add(meetingUserBean);
                    }
                    meetingUserBeanList.addAll(generateUserImgList);
                }
            }
        } catch (Exception e) {
            logger.error("查询抽奖名单错误", e);
            throw new SystemException(ExceptionCode.SYSTEM_ERROR);
        }
        return meetingUserBeanList;
    }

    @Transactional
    @Override
    public List<MeetingPrizeBean> savePrize(int luckyNum, String prize) throws SystemException {
        List<MeetingPrizeBean> prizeList = new ArrayList<MeetingPrizeBean>();
        try {
            List<MeetingUserBean> meetingUserBeanList = meetingUserMapper.selectUser();
            int len = meetingUserBeanList.size();
            Random random = new Random();
            if (luckyNum > 0) {
                for (int i = 0; i < luckyNum; i++) {
                    int prizeIndex = random.nextInt(len);
                    MeetingUserBean meetingUserBean = meetingUserBeanList.get(prizeIndex);
                    if (meetingUserBean != null) {
                        String image = meetingUserBean.getImage();
                        String thumbImage = meetingUserBean.getThumb_image();
                        if (image == null || "".equals(image)) {
                            int index = random.nextInt(5)+1;
                            image = "/static/img/tx" + index + ".png";
                            thumbImage = "/static/img/tx" + index + ".png";
                            meetingUserBean.setImage(image);
                            meetingUserBean.setThumb_image(thumbImage);
                        }
                    }
                    meetingUserBeanList.remove(prizeIndex);
                    len = len - 1;


                    MeetingPrizeBean meetingPrizeBean = new MeetingPrizeBean();
                    meetingPrizeBean.setId(meetingUserBean.getId());
                    meetingPrizeBean.setName(meetingUserBean.getName());
                    meetingPrizeBean.setPrizeLevel(prize);
                    prizeList.add(meetingPrizeBean);
                }
            }

            meetingPrizeMapper.savePrize(prizeList);
        } catch (Exception e) {
            logger.error("抽奖错误", e);
            throw new SystemException(ExceptionCode.SYSTEM_ERROR);
        }
        return prizeList;
    }
}
