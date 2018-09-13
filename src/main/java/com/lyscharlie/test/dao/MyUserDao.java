package com.lyscharlie.test.dao;

import org.apache.ibatis.annotations.Param;

import com.lyscharlie.test.domain.MyUserDO;

public interface MyUserDao {

	public MyUserDO selectById(@Param("id") Long id);

}
