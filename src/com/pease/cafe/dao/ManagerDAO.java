package com.pease.cafe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.pease.cafe.util.DBConnector;

public class ManagerDAO {

//商品追加
	public void productAddInfo(String productName ,String productDiscription ,int categoryId  ,String image_file_path) throws SQLException{
	String sql = "INSERT INTO product_info(productName ,productDiscription ,categoryId ,image_file_path)VALUES(?,?,?,?)";

	DBConnector dbConnector = new DBConnector();
	 Connection connection = dbConnector.getConnection();

	 try{
		 PreparedStatement preparedStatement=connection.prepareStatement(sql);
			String path = "./images/" + image_file_path;
		 preparedStatement.setString(1,productName);
		 preparedStatement.setString(2, productDiscription);
		 preparedStatement.setInt(3, categoryId);
		 preparedStatement.setString(4, path);
			preparedStatement.execute();
	 }catch(Exception e){
		 e.printStackTrace();
	 }finally{
		 connection.close();
		 }
	 }

//	商品情報変更
	public void productUpdateInfo(String productName ,String productDiscription ,int categoryId , int id , String imagefilepath) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		String sql = "UPDATE product_info SETproductName = ?,productDuscription=?,categoryId=? ,imagefilepath=? WHERE  id=?";
		try {

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			String path = "./images/" + imagefilepath;
			preparedStatement.setString(1, productName);
			preparedStatement.setString(2, productDiscription);
			preparedStatement.setInt(3, categoryId);
			preparedStatement.setInt(4, id);
			preparedStatement.setString(5 ,path);

			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}

	public int productDelete(int id)throws SQLException{
		DBConnector dbConnector =new DBConnector();
		Connection connection=dbConnector.getConnection();
		String sql = "DELETE FROM product_info WHERE id=?";
		PreparedStatement preparedStatement ;
		int result=0;
		try{
			preparedStatement =connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			result=preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
				return result;
	}



}
