package com.luck.prize.mapper;

import com.luck.prize.bean.MeetingPrizeBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Classname MeetingPrizeMapper
 * @Date 2019/12/10 11:27
 * @Created by fengpeiyao
 * @Copyright &copy CAUCHINA
 * @Description TODO
 */
@Mapper
public interface MeetingPrizeMapper {

    /**
     * 中奖名单
     * @param meetingPrizeList
     */
    public void savePrize(@Param("prizeList") List<MeetingPrizeBean> meetingPrizeList);
}
