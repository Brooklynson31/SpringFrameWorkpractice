package com.springframework.myfirst.domain;

public class Message {
	private Long ID;
	private String content;
	
	public Message(Long ID, String content){
		this.ID = ID;
		this.content = content;
	}
	
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
