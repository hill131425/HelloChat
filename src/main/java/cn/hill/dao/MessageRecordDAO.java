package cn.hill.dao;

import cn.hill.model.MessageRecordDo;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface MessageRecordDAO {
    int addMessageRecord(MessageRecordDo messageRecordDo);
}
