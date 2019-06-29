package com.peng.service.impl;

import com.peng.dao.UserMapper;
import com.peng.entity.User;
import com.peng.service.DeptService;
import com.peng.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired private UserMapper userMapper;
    @Autowired private DeptService deptService;

    //@Transactional(propagation = Propagation.REQUIRED)
    public void saveUser() {
        logger.debug("======保存动作开始======");
        deptService.saveDept();
        User user = new User("路飞");
        userMapper.insertSelective(user);
        logger.debug("======保存动作结束======");
    }
}
