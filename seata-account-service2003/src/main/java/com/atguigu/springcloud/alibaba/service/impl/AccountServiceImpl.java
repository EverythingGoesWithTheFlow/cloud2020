package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.dao.AccountDao;
import com.atguigu.springcloud.alibaba.domain.Account;
import com.atguigu.springcloud.alibaba.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements AccountService{

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Resource
    private AccountDao accountDao;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return accountDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Account record) {
        return accountDao.insert(record);
    }

    @Override
    public int insertSelective(Account record) {
        return accountDao.insertSelective(record);
    }

    @Override
    public Account selectByPrimaryKey(Long id) {
        return accountDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Account record) {
        return accountDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Account record) {
        return accountDao.updateByPrimaryKey(record);
    }

    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("------->account-service中扣减账户余额开始");
        //模拟超时异常，全局事务回滚
        //暂停几秒钟线程
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        accountDao.decrease(money,userId);
        LOGGER.info("------->account-service中扣减账户余额结束");
    }

}
