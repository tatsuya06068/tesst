package com.pease.cafe.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class GoTopAction extends ActionSupport  implements SessionAware{
	  private Map<String,Object> session;
	public String execute(){
		String result=ERROR;

			session.get("Key");
			System.out.print(session.get("Key"));

		result = SUCCESS;
		return result;


	}




	 public Map<String, Object> getSession() {
	        return session;
	    }
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}