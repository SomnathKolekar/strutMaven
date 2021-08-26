package com.struts.dao;

//import com.struts.pojo.*;
import com.struts.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class BookManagementDAO {
	
public ResultSet getBookReport() {
	Connection connection = DbUtil.getConnection();
	ResultSet resultSet=null;
	try {
		Statement statement = connection.createStatement();
		resultSet = statement.executeQuery("SELECT * FROM book");
		System.out.println("get book records  " +resultSet);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return resultSet;
}
public void addBook(String bookId, String bookName, String bookAuthor, Integer bookPrice) {
	Connection connection = DbUtil.getConnection();
	try {
		PreparedStatement ps1= connection.prepareStatement("INSERT INTO book VALUES(?,?,?,?)");
		ps1.setString(1, bookId);
		ps1.setString(2, bookName);
		ps1.setString(3, bookAuthor);
		ps1.setInt(4, bookPrice);
		ps1.executeUpdate();	
	    System.out.println("new book records inserted...");
		DbUtil.closeConnection(connection);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public ResultSet getBookReportByBookId(String bookId) {
	Connection connection = DbUtil.getConnection();
	ResultSet resultSet=null;
	try {
		PreparedStatement ps1= connection.prepareStatement("SELECT * FROM book WHERE book_id =?");
		ps1.setString(1, bookId);
		resultSet = ps1.executeQuery();
		System.out.println("get book records  " +resultSet);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return resultSet;
}
public void updateBook(String bookId, String bookName, String bookAuthor, Integer bookPrice) {
	Connection connection = DbUtil.getConnection();
	try {
		PreparedStatement ps1= connection.prepareStatement("UPDATE book SET book_name=?,"
				+ "book_author=?,book_price=? WHERE book_id=?");
		ps1.setString(1, bookName);
		ps1.setString(2, bookAuthor);
		ps1.setInt(3, bookPrice);
		ps1.setString(4, bookId);
		ps1.executeUpdate();
		System.out.println("Book Updated - "+  bookId );
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void deleteBook(String bookId) {
	Connection connection = DbUtil.getConnection();
	try {
		PreparedStatement ps1= connection.prepareStatement("DELETE FROM book WHERE book_id =?");
		ps1.setString(1, bookId);
		ps1.executeUpdate();
		System.out.println("Deleted book -  " +bookId);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
