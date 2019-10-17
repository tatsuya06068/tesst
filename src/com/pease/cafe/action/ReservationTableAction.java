package com.pease.cafe.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.pease.cafe.dao.ReservationDAO;
import com.pease.cafe.dto.ReservationDTO;

public class ReservationTableAction extends ActionSupport implements SessionAware{

	private String name;
	private String email;
	private String body;
	private Date reservation_date;
	ArrayList<ReservationDTO>ReservationDTOList=new ArrayList<ReservationDTO>();

	public String ececute() throws SQLException{

		ReservationDAO dao=new ReservationDAO();
       ReservationDTOList=dao.getReservationInfo();

       String result=ERROR;

       result=SUCCESS;


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

	public ArrayList<ReservationDTO> getReservationDTOList() {
		return ReservationDTOList;
	}

	public void setReservationDTOList(ArrayList<ReservationDTO> reservationDTOList) {
		ReservationDTOList = reservationDTOList;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}



}
