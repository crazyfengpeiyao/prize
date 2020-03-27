package com.luck.prize.controller;

import com.google.gson.JsonArray;
import com.luck.prize.bean.MeetingPrizeBean;
import com.luck.prize.bean.MeetingUserBean;
import com.luck.prize.bean.PrizeBean;
import com.luck.prize.service.MeetingUserService;
import com.luck.prize.service.PrizeService;
import information.exception.SystemException;
import information.utils.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Classname MeetingUserController
 * @Date 2019/12/10 10:33
 * @Created by fengpeiyao
 * @Copyright &copy CAUCHINA
 * @Description TODO
 */
@RestController
public class MeetingUserController {


    @Autowired
    private MeetingUserService meetingUserService;

    @Autowired
    private PrizeService prizeService;


    @RequestMapping(value = "/info/meeting/prize/",method = RequestMethod.GET)
    public ModelAndView toPrize(){
        return new ModelAndView("prize");
    }


    /**
     * 获取抽奖名单
     * @return
     */
    @RequestMapping(value = "/info/meeting/user/",method = RequestMethod.GET)
    public ResultInfo getUser(){
        try {
            List<MeetingUserBean> dataArr = meetingUserService.getUser();
            return new ResultInfo<List<MeetingUserBean>>(0,dataArr);
        }catch (SystemException e){
            return new ResultInfo(e.getErrorCode(),e.getMessage());
        }
    }


    /**
     * 抽奖
     * @param lucky_num
     * @param lucky_prize
     * @return
     */
    @RequestMapping(value = "/info/meeting/prize/",method = RequestMethod.POST)
    public ResultInfo prize(@RequestParam(value = "lucky_num",defaultValue = "1")int lucky_num,@RequestParam(value = "lucky_prize",defaultValue = "-1")String lucky_prize){
        try {
            List<MeetingPrizeBean> prizeArr = meetingUserService.savePrize(lucky_num,lucky_prize);
            return new ResultInfo<List<MeetingPrizeBean>>(0,prizeArr);
        }catch (SystemException e){
            return new ResultInfo(e.getErrorCode(),e.getMessage());
        }
    }


    /**
     * 获取所有的奖品
     * @return
     */
    @RequestMapping(value = "/info/meeting/all/prize/",method = RequestMethod.GET)
    public ResultInfo getPrize(@RequestParam(value = "type",defaultValue = "2")int type){
        try {
            List<PrizeBean> dataArr = prizeService.getPrize(type);
            return new ResultInfo<List<PrizeBean>>(0,dataArr);
        }catch (SystemException e){
            return new ResultInfo(e.getErrorCode(),e.getMessage());
        }
    }
}
