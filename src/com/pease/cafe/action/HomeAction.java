package com.pease.cafe.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction  extends ActionSupport implements SessionAware {

	private String loginflg;

public String execute(){

	String result="login";
	if(loginflg!=null){
		result="login";
	}
	System.out.println(loginflg);
	return result;
}


	public String get (){
		return loginflg;
	}

	public void setloginflg(String loginflg){
		this.loginflg=loginflg;
	}

	public void setSession(Map<String, Object> arg0) {
	}

}
