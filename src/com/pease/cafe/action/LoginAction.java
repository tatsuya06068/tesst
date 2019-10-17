package com.pease.cafe.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.pease.cafe.dao.LoginDAO;
import com.pease.cafe.dao.ReservationDAO;
import com.pease.cafe.dto.LoginDTO;
import com.pease.cafe.dto.ProductDTO;
import com.pease.cafe.dto.ReservationDTO;

public class LoginAction extends ActionSupport implements SessionAware{
	private Map<String,Object> session;
	private String UserName;
	private String Password;
	private String nameErrorMessage ;
	private String PasswordErrorMessage;
	private String errorMessage ;
	ArrayList<ProductDTO>productDTOList=new ArrayList<ProductDTO>();
	ArrayList<ReservationDTO>ReservationDTOList=new ArrayList<ReservationDTO>();



	public String execute () throws SQLException{

		LoginDAO loginDAO=new LoginDAO();
		LoginDTO loginDTO=new LoginDTO();

		loginDTO=loginDAO.getUserInfo(UserName,Password);

		if(UserName.equals("")){ //userIdが空欄
			nameErrorMessage = ("【ユーザーIDを入力してください】");
		}


		if(Password.equals("")){ //passwordが空欄
			PasswordErrorMessage = ("【パスワードを入力してください】");
		}

		if(nameErrorMessage != null || PasswordErrorMessage != null){
			return "ERROR";
		}
	 if(loginDTO.getPassword() ==null){
			errorMessage = ("【入力されたIDもしくはパスワードが異なります】");
			return "ERROR";

		}else{


			session.put("Key", 1);

			ReservationDAO dao=new ReservationDAO();
			ReservationDTOList=dao.getReservationInfo();


			return "SUCCES";
		}


	}


	public String getNameErrorMessage() {
		return nameErrorMessage;
	}


	public void setNameErrorMessage(String nameErrorMessage) {
		this.nameErrorMessage = nameErrorMessage;
	}


	public String getPasswordErrorMessage() {
		return PasswordErrorMessage;
	}


	public void setPasswordErrorMessage(String passwordErrorMessage) {
		PasswordErrorMessage = passwordErrorMessage;
	}


	public String getErrorMessage() {
		return errorMessage;
	}


	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public ArrayList<ReservationDTO> getReservationDTOList() {
		return ReservationDTOList;
	}

	public void setReservationDTOList(ArrayList<ReservationDTO> reservationDTOList) {
		ReservationDTOList = reservationDTOList;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String UserName) {
		this.UserName = UserName;
	}

	public String getPassword(){
		return Password;
	}

	public void setPassword(String Password){
		this.Password=Password;
	}

	public ArrayList<ProductDTO> getProductDTOList() {
		return productDTOList;
	}

	public void setProductDTOList(ArrayList<ProductDTO> productDTOList) {
		this.productDTOList = productDTOList;
	}



	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}