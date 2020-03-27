package com.luck.prize.service;

import com.luck.prize.bean.PrizeBean;
import information.exception.SystemException;

import java.util.List;

/**
 * @Classname PrizeService
 * @Date 2019/12/10 13:46
 * @Created by fengpeiyao
 * @Copyright &copy CAUCHINA
 * @Description TODO
 */
public interface PrizeService {

    /**
     * 获取所有的奖品
     * @return
     */
    public List<PrizeBean> getPrize(int type) throws SystemException;
}
