package cn.hill.service;

import cn.hill.model.LoginInfoDo;
import cn.hill.model.MessageRecordDo;
import cn.hill.model.User;

/**
 * 用户service接口
 */
public interface UserService {

    /**
     * 验证用户密码
     * @param name
     * @param password
     * @return 正确返回该用户对象，否则返回空
     */
     User validateUserPassword(String name, String password);

    /**
     * 该用户是否已经注册
     * @param name
     * @return
     */
     boolean isExistUser(String name);

    /**
     * 插入一名用户
     * @param name
     * @param password
     */
     void insertUser(String name, String password);

     void addUserLoginInfo(LoginInfoDo loginInfoDo);

     void addUserMessageRecord(MessageRecordDo messageRecordDo);

     User getUserByName(String name);
}
