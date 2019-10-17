package com.pease.cafe.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.pease.cafe.dao.ProductDAO;
import com.pease.cafe.dao.ReservationDAO;
import com.pease.cafe.dto.ProductDTO;
import com.pease.cafe.dto.ReservationDTO;

public class GoManagerAction extends ActionSupport implements SessionAware{


	ArrayList<ProductDTO> productDTOList = new ArrayList<ProductDTO>();
	ArrayList<ReservationDTO>ReservationDTOList=new ArrayList<ReservationDTO>();

	public String execute () throws SQLException{


	ProductDAO dao=new ProductDAO();
	productDTOList=dao.getProductInfo();
	ReservationDAO Rdao=new ReservationDAO();
    ReservationDTOList=Rdao.getReservationInfo();


return SUCCESS;
}

	public ArrayList<ProductDTO> getProductDTOList() {
		return productDTOList;
	}

	public void setProductDTOList(ArrayList<ProductDTO> productDTOList) {
		this.productDTOList = productDTOList;
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
