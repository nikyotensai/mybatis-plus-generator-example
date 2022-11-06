package com.github.nikyotensai.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author nikyotensai
 * @since 2022/11/6
 */
@Data
public class BaseEntity {


    private Date createTime;

    private Date updateTime;

    private Integer deleted;

}
