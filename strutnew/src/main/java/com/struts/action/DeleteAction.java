package com.struts.action;

import com.struts.dao.BookManagementDAO;

public class DeleteAction {

	String bookId;
	BookManagementDAO dao =  new BookManagementDAO();
	public String execute() throws Exception {
		dao.deleteBook(bookId);
		return "success";
	}
	
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	
}