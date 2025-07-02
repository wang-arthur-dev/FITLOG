package com.fitlog.mvc.model.dto;

import org.springframework.web.multipart.MultipartFile;

public class BoardFile {
	private int fileId;				// 파일 기본키
    private int colboardId; 		// 게시판 외래키
    private String originalName;	// 원본 파일이름
    private String uploadName;		// 서버저장 파일이름
    private long fileSize;			// 파일 크기
    
    public BoardFile() {}

	public int getFileId() {
		return fileId;
	}

	public void setFileId(int fileId) {
		this.fileId = fileId;
	}

	public int getColboardId() {
		return colboardId;
	}

	public void setColboardId(int colboardId) {
		this.colboardId = colboardId;
	}

	public String getOriginalName() {
		return originalName;
	}

	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}

	public String getUploadName() {
		return uploadName;
	}

	public void setUploadName(String uploadName) {
		this.uploadName = uploadName;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	@Override
	public String toString() {
		return "BoardFile [fileId=" + fileId + ", colboardId=" + colboardId + ", originalName=" + originalName
				+ ", uploadName=" + uploadName + ", fileSize=" + fileSize + "]";
	}
	
}
