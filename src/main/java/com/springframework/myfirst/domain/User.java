package com.springframework.myfirst.domain;

import java.util.List;

public class User {
 private String username;
 private String password;
 private String accountType;
 private Boolean userAgreement;
 private List<String> visitedCountires;
 
 
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public Boolean getUserAgreement() {
	return userAgreement;
}
public void setUserAgreement(Boolean userAgreement) {
	this.userAgreement = userAgreement;
}
public List<String> getVisitedCountires() {
	return visitedCountires;
}
public void setVisitedCountires(List<String> visitedCountires) {
	this.visitedCountires = visitedCountires;
}

}
