package cn.hill.service.impl;

import cn.hill.dao.LoginInfoDAO;
import cn.hill.dao.MessageRecordDAO;
import cn.hill.dao.UserDAO;
import cn.hill.model.LoginInfoDo;
import cn.hill.model.MessageRecordDo;
import cn.hill.model.User;
import cn.hill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户service实现类
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private LoginInfoDAO loginInfoDAO;

    @Autowired
    private MessageRecordDAO messageRecordDAO;


    @Override
    public User validateUserPassword(String name, String password) {
        return userDAO.queryUser(name, password);
    }

    @Override
    public boolean isExistUser(String name) {
        User user = userDAO.queryUserByName(name);
        return user != null;
    }

    @Override
    public void insertUser(String name, String password) {
        userDAO.insertUser(name, password);
    }

    @Override
    public void addUserLoginInfo(LoginInfoDo loginInfoDo) {
        loginInfoDAO.addLoginInfo(loginInfoDo);
    }

    @Override
    public void addUserMessageRecord(MessageRecordDo messageRecordDo) {
        messageRecordDAO.addMessageRecord(messageRecordDo);
    }

    @Override
    public User getUserByName(String name) {
        return userDAO.getUserByName(name);
    }
}
