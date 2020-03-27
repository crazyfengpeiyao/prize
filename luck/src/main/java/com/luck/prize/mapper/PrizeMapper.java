package com.luck.prize.mapper;

import com.luck.prize.bean.PrizeBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Classname PrizeMapper
 * @Date 2019/12/10 13:41
 * @Created by fengpeiyao
 * @Copyright &copy CAUCHINA
 * @Description TODO
 */
@Mapper
public interface PrizeMapper {

    /**
     * 查询所有的奖品
     * @return
     */
    public List<PrizeBean> selectPrize(@Param("type") int type);
}
