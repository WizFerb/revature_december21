package com.linkedin.entity;

import java.time.LocalTime;

public class TimeLineEntity {
	
	private String sender;
	private String timeofmessage;
	private String message;
	private String receiver;
	
	
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getTimeofmessage() {
		return timeofmessage;
	}
	public void setTimeofmessage(String timeofmessage) {
		this.timeofmessage = timeofmessage;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
