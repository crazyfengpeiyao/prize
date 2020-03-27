package com.luck.prize.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname MeetingUserBean
 * @Date 2019/12/10 10:00
 * @Created by fengpeiyao
 * @Copyright &copy CAUCHINA
 * @Description TODO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MeetingUserBean {

    private int id;
    private String name;
    private String image;
    private String thumb_image;
}
