package cn.hill.dao;

import cn.hill.model.LoginInfoDo;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface LoginInfoDAO {
    int addLoginInfo(LoginInfoDo loginInfoDo);
}
