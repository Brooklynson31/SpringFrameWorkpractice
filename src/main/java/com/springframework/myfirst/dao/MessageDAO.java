package com.springframework.myfirst.dao;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springframework.myfirst.domain.Message;

@Repository
public class MessageDAO {
	List<Message> messages = new ArrayList<Message>(); 
	
//	public MessageDAO(){
//		addMessagestoList(1L,"message 1");
//		addMessagestoList(2L,"message 2");
//		addMessagestoList(3L,"message 3");
//		addMessagestoList(4L,"message 4");
//		addMessagestoList(5L,"message 5");
//		addMessagestoList(6L,"message 6");
//		addMessagestoList(7L,"message 7");
//	}
	
	public List<Message> getMessages(){
	addMessagestoList(1L,"message 1");
	addMessagestoList(2L,"message 2");
	addMessagestoList(3L,"message 3");
	addMessagestoList(4L,"message 4");
	addMessagestoList(5L,"message 5");
	addMessagestoList(6L,"message 6");
	addMessagestoList(7L,"message 7");
	
		return messages;
	}

	private void addMessagestoList(Long id, String content) {
		Message message = new Message( id,  content);	
		messages.add(message);
	}


}
