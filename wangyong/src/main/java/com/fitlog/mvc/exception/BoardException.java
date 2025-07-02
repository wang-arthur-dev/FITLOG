package com.fitlog.mvc.exception;

public class BoardException extends RuntimeException{
	public BoardException() {}
	
	public BoardException(String message) {
		super(message);
	}
}
