package com.luck.prize.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname MeetingPrizeBean
 * @Date 2019/12/10 11:24
 * @Created by fengpeiyao
 * @Copyright &copy CAUCHINA
 * @Description TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MeetingPrizeBean {

    private int id;
    private String name;
    private String prizeLevel;
}
