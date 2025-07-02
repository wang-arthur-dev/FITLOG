package com.fitlog.mvc.service;

import com.fitlog.mvc.model.dto.LoginRequest;
import com.fitlog.mvc.model.dto.User;
import com.fitlog.mvc.model.dto.UserDetail;

import java.io.IOException;

public interface UserService {
    public int insertUser(User user) throws IOException;
    public int updateUser(User user, String userId) throws IOException;
	public LoginRequest login(LoginRequest loginRequest);
    public User getUserInfo(String userId);
    public int updateUserDetail(UserDetail userDetail);

	public boolean confirmId(String id);
	public boolean confirmName(String name);

}
