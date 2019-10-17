package com.pease.cafe.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.pease.cafe.dao.ReservationDAO;

public class ReservationCompleteAction extends ActionSupport implements SessionAware{

	public Map<String,Object>session;
	private String name;
	private String email;
	private String body;
	private String reservation_date;
	private ReservationDAO dao=new ReservationDAO();

	public String execute() throws SQLException{

	String result=ERROR;

	 dao.insertReservation(
     name,
     email,
     body,
      reservation_date
				) ;

	 result=SUCCESS;
	 return result;

	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getReservation_date() {
		return reservation_date;
	}
	public void setReservation_date(String reservation_date) {
		this.reservation_date = reservation_date;
	}

}
