package com.pease.cafe.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.pease.cafe.dao.ProductDAO;
import com.pease.cafe.dto.ProductDTO;

public class ProductAction extends ActionSupport implements SessionAware{



	private Map<String,Object> session;

ArrayList<ProductDTO> productDTOList = new ArrayList<ProductDTO>();

public String execute () throws SQLException{

	String result="ERROR";

	ProductDAO dao=new ProductDAO();
	productDTOList=dao.getProductInfo();

     result = "SUCCES";
return result;

}




public Map<String, Object> getSession() {
	return session;
}

public void setSession(Map<String, Object> session) {
	this.session = session;
}



public ArrayList<ProductDTO> getProductDTOList() {
	return productDTOList;
}

public void setProductDTOList(ArrayList<ProductDTO> productDTOList) {
	this.productDTOList = productDTOList;
}




}
