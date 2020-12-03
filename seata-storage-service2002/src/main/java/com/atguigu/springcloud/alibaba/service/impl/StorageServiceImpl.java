package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.dao.StorageDao;
import com.atguigu.springcloud.alibaba.domain.Storage;
import com.atguigu.springcloud.alibaba.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class StorageServiceImpl implements StorageService{

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Resource
    private StorageDao storageDao;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return storageDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Storage record) {
        return storageDao.insert(record);
    }

    @Override
    public int insertSelective(Storage record) {
        return storageDao.insertSelective(record);
    }

    @Override
    public Storage selectByPrimaryKey(Long id) {
        return storageDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Storage record) {
        return storageDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Storage record) {
        return storageDao.updateByPrimaryKey(record);
    }

    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("------->storage-service中扣减库存开始");
        storageDao.decrease(productId,count);
        LOGGER.info("------->storage-service中扣减库存结束");
    }

}
