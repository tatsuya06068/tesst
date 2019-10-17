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

public class ManagerChangeCompleteAction extends ActionSupport implements SessionAware{
  private String  productName;
  private String  productDiscription;
  private int categoryId;
  private String id;
  private String image_file_path;
	private File file;
	private String filePath;
	private String imageFileName;
  ArrayList<ProductDTO>productDTOList=new ArrayList<ProductDTO>();

  public String execute()throws SQLException{
	  String result=ERROR;
	  ManagerDAO dao=new ManagerDAO();
	  ProductDAO Pdao=new ProductDAO();
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
	  if(productName.equals(null)){
		  return result;
	  }else if(!productName.equals(null)){
		  dao. productUpdateInfo(
				  productName,
				  productDiscription,
				  categoryId,
				 Integer.parseInt( id),
                 filePath
							  );

		  productDTOList=Pdao.getProductInfo();
		  result = SUCCESS;
	  }
	return result;



  }


public String getProductName() {
	return productName;
}


public void setProductName(String productName) {
	this.productName = productName;
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

public String getImage_file_path() {
	return image_file_path;
}


public void setImage_file_path(String image_file_path) {
	this.image_file_path = image_file_path;
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


@Override
public void setSession(Map<String, Object> arg0) {
	// TODO 自動生成されたメソッド・スタブ

}
}
