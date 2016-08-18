package com.springframework.myfirst.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springframework.myfirst.dao.LoginDao;
import com.springframework.myfirst.domain.User;

@Service
public class LoginService {

	@Autowired
	LoginDao logindao;
	
private LoginService(){
	
}
	

public User validateUsernameandPassword(User user){
	
	//checking user input placed, check to see if it is the username you desire.
	 if("".equals(user.getUsername()) || "".equals(user.getPassword())){
		 return null;
	 }
//	 else if(user.getUsername() != "Mike"){
//		 return null;
//	 }
		//go to database and get User object value returned from getUser method

		User userFromDB = logindao.getUser(user);


		return userFromDB;
	
}
}
