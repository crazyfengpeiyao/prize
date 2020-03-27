package com.luck.prize.service;

import com.google.gson.JsonArray;
import com.luck.prize.bean.MeetingPrizeBean;
import com.luck.prize.bean.MeetingUserBean;
import information.exception.SystemException;

import java.util.List;

/**
 * @Classname MeetingUserService
 * @Date 2019/12/10 10:27
 * @Created by fengpeiyao
 * @Copyright &copy CAUCHINA
 * @Description TODO
 */
public interface MeetingUserService {


    /**
     * 抽奖名单
     * @return
     * @throws SystemException
     */
    public List<MeetingUserBean> getUser() throws SystemException;


    /**
     * 抽奖
     * @param luckyNum
     * @param prize
     * @return
     * @throws SystemException
     */
    public List<MeetingPrizeBean> savePrize(int luckyNum, String prize) throws SystemException;
}
