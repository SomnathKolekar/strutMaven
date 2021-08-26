package com.struts.action;

import java.sql.ResultSet;

import com.struts.dao.BookManagementDAO;


public class UpdateDataAction {
	String bookId;
	String bookName;
	String bookAuthor;
	Integer bookPrice;
	ResultSet rs =null;
	BookManagementDAO dao = new BookManagementDAO();
	public String execute() throws Exception {
		try {
			rs = dao.getBookReportByBookId(bookId);
			if (rs != null) {
				while (rs.next()) {
					bookId =(rs.getString("book_id"));
					bookName = (rs.getString("book_name"));
					bookAuthor = (rs.getString("book_author"));
					bookPrice = (rs.getInt("book_price"));
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	 }
	
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public Integer getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Integer bookPrice) {
		this.bookPrice = bookPrice;
	}
}


