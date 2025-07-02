package com.fitlog.mvc.model.dao;

import com.fitlog.mvc.model.dto.LoginRequest;
import com.fitlog.mvc.model.dto.User;
import com.fitlog.mvc.model.dto.UserDetail;

public interface UserDao {
    int insertUser(User user);
    User findUserByIdUser(String userId);
    LoginRequest findUserByIdLogin(String userId);
    int updateUser(User originUser);
    int updateUserDetail(UserDetail userDetail);

    int confirmId(String user);
	int confirmName(String name);


}
