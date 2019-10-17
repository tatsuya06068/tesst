package com.pease.cafe.action;

import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.pease.cafe.dao.ManagerDAO;
import com.pease.cafe.dao.ProductDAO;
import com.pease.cafe.dto.ProductDTO;

public class ManagerAddCompleteAction extends ActionSupport implements SessionAware{

	private String name;
	private String productDiscription;
	private int categoryId;
	private String id;
	private String imageFileName;
	private File file;
	private String filePath;

	private String productName;

	ArrayList<ProductDTO>productDTOList=new ArrayList<ProductDTO>();


	public String execute()throws SQLException{
		String result=ERROR;
		ManagerDAO dao=new ManagerDAO();
		ProductDAO PDao=new ProductDAO();

		if(name.equals(null)){
			return result;
		}else if(!name.equals(null)){
			dao.productAddInfo(

					name,
					productDiscription,
					categoryId,
					imageFileName


					);

			productDTOList=PDao.getProductInfo();
			result =SUCCESS;



		}


		return result;
	}


	public String getImageFileName() {
		return imageFileName;
	}


	public File getFile() {
		return file;
	}


	public void setFile(File file) {
		this.file = file;
	}


	public String getFilePath() {
		return filePath;
	}


	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductDiscription() {
		return productDiscription;
	}

	public void setProductDiscription(String productDiscription) {
		this.productDiscription = productDiscription;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<ProductDTO> getProductDTOList() {
		return productDTOList;
	}

	public void setProductDTOList(ArrayList<ProductDTO> productDTOList) {
		this.productDTOList = productDTOList;
	}
	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
