package com.pease.cafe.action;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import javax.imageio.ImageIO;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.pease.cafe.dao.ManagerDAO;
import com.pease.cafe.dao.ProductDAO;
import com.pease.cafe.dto.ProductDTO;

public class ManagerAction extends ActionSupport implements SessionAware{

	private String name;
	private String productDiscription;
	private int categoryId;
	private String id;
	private String deleteFlg;
	private String addFlg;
	private String changeFlg;
	private String image_file_path;
	private File file;
	private String filePath;
	private String imageFileName;
	private String productName;

	ArrayList<ProductDTO> productDTOList=new ArrayList<ProductDTO>();
	ProductDAO PDao=new ProductDAO();

	public String execute()throws SQLException{

		String result = ERROR;

		if(deleteFlg !=null){
			result=this.delete(id);
		}

		if(addFlg !=null){
			result=this.add(id);
		}

		if(changeFlg !=null){
				result="Change";
		}
		return result;

	}



	private String delete(String id) throws SQLException{
		String result=ERROR;

		int count=0;

		ManagerDAO dao=new ManagerDAO();
		count += dao.productDelete(Integer.parseInt(id));
		if(count>0){
			result=SUCCESS;
		}
		productDTOList=PDao.getProductInfo();
		return result;
	}


	private String add(String id)throws SQLException{
		BufferedImage readImage = null;
		imageFileName = String.valueOf(new Date().getTime()) + ".jpg";
		filePath = "./images/" + imageFileName;
		String realPath = ServletActionContext.getServletContext().getRealPath(filePath);

		try {
			readImage = ImageIO.read(file);
			ImageIO.write(readImage, "jpg", new File(realPath));
		}catch(IOException e) {
			e.printStackTrace();
			readImage = null;
		}
		String result="Add";

		return result;
	}










	public String getImage_file_path() {
		return image_file_path;
	}



	public void setImage_file_path(String image_file_path) {
		this.image_file_path = image_file_path;
	}






	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public ProductDAO getPDao() {
		return PDao;
	}



	public void setPDao(ProductDAO pDao) {
		PDao = pDao;
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

	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	public String getAddFlg() {
		return addFlg;
	}

	public void setAddFlg(String addFlg) {
		this.addFlg = addFlg;
	}

	public String getChangeFlg() {
		return changeFlg;
	}

	public void setChangeFlg(String changeFlg) {
		this.changeFlg = changeFlg;
	}

	public ArrayList<ProductDTO> getProductDTOList() {
		return productDTOList;
	}

	public void setProductDTOList(ArrayList<ProductDTO> productDTOList) {
		this.productDTOList = productDTOList;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ
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



	public String getImageFileName() {
		return imageFileName;
	}



	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}





}
