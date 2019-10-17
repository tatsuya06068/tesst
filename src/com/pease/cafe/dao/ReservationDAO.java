package com.pease.cafe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.pease.cafe.dto.ReservationDTO;
import com.pease.cafe.util.DBConnector;


public class ReservationDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();




	public boolean insertReservation(String name,String email, String body,String reservation_date)throws SQLException{

		String sql ="insert into reservation_info(name ,email ,body ,reservation_date) values(?,?,?,?)";
		boolean result=false;

		try{PreparedStatement ps=con.prepareStatement(sql);

		ps.setString(1,name);
		ps.setString(2,email);
		ps.setString(3,body);
		ps.setString(4,reservation_date);

		int count = ps.executeUpdate();
		if(count > 0){
			result=true;
		}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return result;
	}

	public ArrayList<ReservationDTO>getReservationInfo()throws SQLException{

		ArrayList<ReservationDTO>ReservationDTOList=new ArrayList<ReservationDTO>();
      String sql="SELECT name ,email ,body ,reservation_date from reservation_Info";

      try{
    	  PreparedStatement preparedStatement=con.prepareStatement(sql);
    	  ResultSet resultSet=preparedStatement.executeQuery();

    	  while(resultSet.next()){
    		  ReservationDTO dto=new ReservationDTO();
    		  dto.setName(resultSet.getString("name"));
    		  dto.setEmail(resultSet.getString ("email"));
    		  dto.setBody(resultSet.getString ("body"));
    		  dto.setReservation_date(resultSet.getString("reservation_date"));

    		  ReservationDTOList.add(dto);
    	  }

      }catch(Exception e){
    	  e.printStackTrace();
      }finally{
    	  con.close();
      }

return ReservationDTOList;
	}


}
