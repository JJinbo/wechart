package com.ideal.user.mapper;

import java.util.List;

import com.ideal.entity.UserInfoEntity;


public interface UserMapper {
    
	List<UserInfoEntity> queryAllUser();

	UserInfoEntity queryUserBy(UserInfoEntity user);
	
}
