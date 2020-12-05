package com.atguigu.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private Long id;

    /**
    * 用户id
    */
    private Long userId;

    /**
    * 总额度
    */
    private Long total;

    /**
    * 已用余额
    */
    private Long used;

    /**
    * 剩余可用额度
    */
    private Long residue;
}