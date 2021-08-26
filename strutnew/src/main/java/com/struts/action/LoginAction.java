package com.struts.action;

import com.struts.dao.LoginDAO;




public class LoginAction {

	String userName;
	String password;
	
	public String execute() {
		System.out.println(userName +"----"+password);
		return LoginDAO.athentication(userName,password);
		    }

	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}