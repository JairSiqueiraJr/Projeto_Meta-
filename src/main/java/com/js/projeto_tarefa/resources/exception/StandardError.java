package com.js.projeto_tarefa.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {
	
	private Long Timestamp;
	private Integer status;
	private String message;
	public StandardError() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StandardError(Long timestamp, Integer status, String message) {
		super();
		Timestamp = timestamp;
		this.status = status;
		this.message = message;
	}
	public Long getTimestamp() {
		return Timestamp;
	}
	public void setTimestamp(Long timestamp) {
		Timestamp = timestamp;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
