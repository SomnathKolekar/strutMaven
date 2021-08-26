package com.struts.action;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.dao.BookManagementDAO;
import com.struts.pojo.Book;

public class BooksAction extends ActionSupport{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	ResultSet rs = null;
	Book book = null;
	List<Book> bookList = null;
	

	boolean noData = false;
	BookManagementDAO dao = new BookManagementDAO();
    @Override
	public String execute() throws Exception {
		try {
			bookList = new ArrayList<Book>();
			rs = dao.getBookReport();
			int i = 0;
			if (rs != null) {
				while (rs.next()) {
					i++;
					book = new Book();
					book.setBookId(rs.getString("book_id"));
					book.setBookName(rs.getString("book_name"));
					book.setBookAuthor(rs.getString("book_author"));
					book.setBookPrice(rs.getInt("book_price"));
					bookList.add(book);
				}
			}
			if (i == 0) {
				noData = false;
			} else {
				noData = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(bookList.toString());
		return "success";
	}

	public boolean isNoData() {
		return noData;
	}

	public void setNoData(boolean noData) {
		this.noData = noData;
	}
	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
}
