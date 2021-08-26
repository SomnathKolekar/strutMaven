package com.struts.action;
import com.struts.dao.*;
import com.opensymphony.xwork2.ActionSupport;

public class AddAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -433853965149957359L;
	String bookId;
	String bookName;
	String bookAuthor;
	Integer bookPrice;
	BookManagementDAO dao =  new BookManagementDAO();
	@Override
	public String execute() throws Exception {
		dao.addBook(bookId,bookName,bookAuthor,bookPrice);
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