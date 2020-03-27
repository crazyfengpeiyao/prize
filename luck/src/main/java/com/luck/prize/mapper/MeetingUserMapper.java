package com.luck.prize.mapper;

import com.luck.prize.bean.MeetingUserBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Classname MeetingUserMapper
 * @Date 2019/12/10 10:11
 * @Created by fengpeiyao
 * @Copyright &copy CAUCHINA
 * @Description TODO
 */
@Mapper
public interface MeetingUserMapper {

    /**
     * 查询所有的人
     * @return
     */
    public List<MeetingUserBean> selectUser();

}
