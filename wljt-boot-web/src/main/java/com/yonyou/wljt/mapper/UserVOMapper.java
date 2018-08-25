package com.yonyou.wljt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yonyou.wljt.pojo.UserVO;
import com.yonyou.wljt.pojo.UserVOExample;

public interface UserVOMapper {
    int countByExample(UserVOExample example);

    int deleteByExample(UserVOExample example);

    int deleteByPrimaryKey(String cuserid);

    int insert(UserVO record);

    int insertSelective(UserVO record);

    List<UserVO> selectByExample(UserVOExample example);

    UserVO selectByPrimaryKey(String cuserid);

    int updateByExampleSelective(@Param("record") UserVO record, @Param("example") UserVOExample example);

    int updateByExample(@Param("record") UserVO record, @Param("example") UserVOExample example);

    int updateByPrimaryKeySelective(UserVO record);

    int updateByPrimaryKey(UserVO record);
    
    List<String> queryResURLByUserId(@Param("cuserid")String cuserid);
    
    List<String> queryAllResURLByRoot();
    
}