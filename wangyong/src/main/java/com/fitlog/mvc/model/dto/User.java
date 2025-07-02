package com.fitlog.mvc.model.dto;

import org.springframework.web.multipart.MultipartFile;

public class User {
    private String userId;
    private String userName;
    private int userRole;
    private String password;
    private MultipartFile attach;
    private UserFile userFile;
    private UserRole userRoleName;
    private UserDetail userDetail;
    private boolean editable;

    public User() {

    }
    // 각 파일에 대한 정보

    //생성자

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }

    public UserRole getUserRoleName() {
        return userRoleName;
    }

    public void setUserRoleName(UserRole userRoleName) {
        this.userRoleName = userRoleName;
    }

    public MultipartFile getAttach() {
        return attach;
    }

    public void setAttach(MultipartFile attach) {
        this.attach = attach;
    }

    public UserFile getUserFile() {
        return userFile;
    }

    public void setUserFile(UserFile userFile) {
        this.userFile = userFile;
    }

    public User(String userId, String userName, int userRole, String password) {
        this.userId = userId;
        this.userName = userName;
        this.userRole = userRole;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserRole() {
        return userRole;
    }

    public void setUserRole(int userRole) {
        this.userRole = userRole;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }


    @Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userRole=" + userRole + ", password=" + password
				+ "]";
	}
    
}

