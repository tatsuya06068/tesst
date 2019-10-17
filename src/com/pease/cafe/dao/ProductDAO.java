package com.pease.cafe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.pease.cafe.dto.ProductDTO;
import com.pease.cafe.util.DBConnector;

public class ProductDAO {

	public ArrayList<ProductDTO>getProductInfo()throws SQLException{

		DBConnector dbConnector =new DBConnector();
		Connection connection=dbConnector.getConnection();

		ArrayList<ProductDTO>productDTOList=new ArrayList<ProductDTO>();

		String sql ="SELECT id ,productName ,productDiscription ,categoryId ,image_file_path FROM product_info";
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet =preparedStatement.executeQuery();

		 while(resultSet.next()){
			 ProductDTO dto=new ProductDTO();
			 dto.setId(resultSet.getInt("id"));
			 dto.setProductName(resultSet.getString("productName"));
			 dto.setProductDiscription(resultSet.getString("productDiscription"));
			 dto.setCategoryId(resultSet.getInt("categoryId"));
			 dto.setImage_file_path(resultSet.getString("image_file_path"));

			 productDTOList.add(dto);
		 }

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return productDTOList;


	}


}
