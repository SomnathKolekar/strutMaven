package com.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.dao.BookManagementDAO;


public class UpdateAction extends ActionSupport{
	String bookId;
	String bookName;
	String bookAuthor;
	Integer bookPrice;
	
	BookManagementDAO dao =  new BookManagementDAO();
	@Override
	public String execute() throws Exception {
		dao.updateBook(bookId,bookName,bookAuthor,bookPrice);
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