package com.luck.prize.service.impl;

import com.google.gson.JsonArray;
import com.luck.prize.bean.PrizeBean;
import com.luck.prize.mapper.PrizeMapper;
import com.luck.prize.service.PrizeService;
import information.exception.ExceptionCode;
import information.exception.SystemException;
import information.utils.GsonUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname PrizeServiceImpl
 * @Date 2019/12/10 13:47
 * @Created by fengpeiyao
 * @Copyright &copy CAUCHINA
 * @Description TODO
 */
@Service("prizeService")
public class PrizeServiceImpl implements PrizeService {

    private Logger logger = LogManager.getLogger(PrizeServiceImpl.class);

    @Autowired
    private PrizeMapper prizeMapper;

    @Override
    public List<PrizeBean> getPrize(int type) throws SystemException {
        List<PrizeBean> prizeList = null;
        try {
            prizeList = prizeMapper.selectPrize(type);
        }catch (Exception e){
            logger.error("获取奖品错误",e);
            throw new SystemException(ExceptionCode.SYSTEM_ERROR);
        }
        return prizeList;
    }
}
