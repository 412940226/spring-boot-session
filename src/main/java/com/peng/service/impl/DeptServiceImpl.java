package com.peng.service.impl;

import com.peng.dao.UserMapper;
import com.peng.entity.User;
import com.peng.service.DeptService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeptServiceImpl implements DeptService {

    private final static Logger logger = LoggerFactory.getLogger(DeptServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    //@Transactional(propagation = Propagation.REQUIRES_NEW)
    public void saveDept() {
        User user = new User("娜美");
        userMapper.insertSelective(user);
//        if (true){
//            throw new RuntimeException("saveDept 抛异常了");
//        }
    }
}
