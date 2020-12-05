package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.alibaba.domain.Account;

import java.math.BigDecimal;

public interface AccountService{


    int deleteByPrimaryKey(Long id);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);

    void decrease(Long userId, BigDecimal money);
}
