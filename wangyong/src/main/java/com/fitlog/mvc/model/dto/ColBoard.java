package com.fitlog.mvc.model.dto;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;


public class ColBoard {
    private int colboardId;        // 기본키
    private String userId;         
    private int category;          
    private String title;          
    private String content;        
    private int viewCnt;           
    private String createdAt;
    
	private List<MultipartFile> attach;	// 여러 파일 등록 시  유연함
	private List<BoardFile> boardFiles;	// 각 파일에 대한 정보
    
    public ColBoard() {}

	public int getColboardId() {
		return colboardId;
	}

	public void setColboardId(int colboardId) {
		this.colboardId = colboardId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public List<MultipartFile> getAttach() {
		return attach;
	}

	public void setAttach(List<MultipartFile> attach) {
		this.attach = attach;
	}

	public List<BoardFile> getBoardFiles() {
		return boardFiles;
	}

	public void setBoardFiles(List<BoardFile> boardFiles) {
		this.boardFiles = boardFiles;
	}

	@Override
	public String toString() {
		return "ColBoard [colboardId=" + colboardId + ", userId=" + userId + ", category=" + category + ", title="
				+ title + ", content=" + content + ", viewCnt=" + viewCnt + ", createdAt=" + createdAt + ", attach="
				+ attach + ", boardFiles=" + boardFiles + "]";
	}
    
}
