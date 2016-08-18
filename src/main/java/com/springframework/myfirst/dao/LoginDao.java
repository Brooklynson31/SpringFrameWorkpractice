package com.springframework.myfirst.dao;


import org.springframework.stereotype.Repository;

import com.springframework.myfirst.domain.User;

@Repository
public class LoginDao {


	//typically where we would make a connection with DB and make query
	public User getUser(User user){
		
		User userFromDB = new User();
		userFromDB.setUsername("Mike"); //if login is successful we will always see this since hardcoded.
		//String a = "Mike";
		//user.setUsername(a);
		
		
		return userFromDB;	
	}
	
	public User getPassword(User user){
	
		return null;
	}
	
}
