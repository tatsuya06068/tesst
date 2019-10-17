package com.pease.cafe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pease.cafe.dto.LoginDTO;
import com.pease.cafe.util.DBConnector;

public class LoginDAO {

public LoginDTO getUserInfo(String UserName, String Password) throws SQLException{
	LoginDTO loginDTO=new LoginDTO();
	DBConnector dbConnector=new DBConnector();
	Connection connection=dbConnector.getConnection();

	String sql="SELECT userName, password FROM user_Info WHERE UserName= ? AND Password= ?  ";

	try {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, UserName);
		preparedStatement.setString(2, Password);
		System.out.println(UserName);
		ResultSet resultSet = preparedStatement.executeQuery();

		if(resultSet.next()) {
			loginDTO.setUserName(resultSet.getString("UserName"));
			loginDTO.setPassword(resultSet.getString("Password"));

		}
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		connection.close();
	}
	return loginDTO;

  }

}
