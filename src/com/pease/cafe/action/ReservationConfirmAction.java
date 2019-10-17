package com.pease.cafe.action;

import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ReservationConfirmAction extends ActionSupport implements SessionAware{

private String name;
private String email;
private String body;
private Date reservation_date;

public String execute(){

	String result=SUCCESS;
	if(name == null){

		result=ERROR;
	}



	return result;




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
public Date getReservation_date() {
	return reservation_date;
}
public void setReservation_date(Date reservation_date) {
	this.reservation_date = reservation_date;
}

@Override
public void setSession(Map<String, Object> arg0) {


}

}
