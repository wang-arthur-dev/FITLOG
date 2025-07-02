package com.fitlog.mvc.service;

import java.util.List;

import com.fitlog.mvc.model.dto.BoardFile;
import com.fitlog.mvc.model.dto.UserFile;

public interface FileService {
	
	List<BoardFile> getBoardFiles(int colboardId);
	
	// 프로필 이미지 관련 메서드 추가
	UserFile getProfileImage(String userId);
	int uploadProfileImage(UserFile userFile);
	int deleteProfileImage(String userId);
    UserFile getUserFiles(String userId);
}
