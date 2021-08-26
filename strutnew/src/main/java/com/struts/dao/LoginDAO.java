package com.struts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.struts.DbUtil;

public class LoginDAO {
	public static  String athentication(String userName, String password) {

		  String ret = "error";
		       Connection conn = DbUtil.getConnection();
		       try {
		          String sql = "SELECT user_name FROM user WHERE";
		          sql+=" user_name = ? AND password = ?";
		          PreparedStatement ps = conn.prepareStatement(sql);
		          ps.setString(1, userName);
		          ps.setString(2, password);
		          ResultSet rs = ps.executeQuery();
                  System.out.println(rs);
		          while (rs.next()) {
		           userName = rs.getString(1);
		           ret = "success";
		          }
		       } catch (Exception e) {
		    	   e.getMessage();
		          ret = "error";
		       } finally {
		          if (conn != null) {
		             try {
		                conn.close();
		             } catch (Exception e) {
		             }
		          }
		       }
		       return ret;		
	}

}
