package org.tnsif.dao;

import java.util.List;

import org.tnsif.enities.Book;

public interface BookDao {
	
	//abstract by default
	
		Book getBookById(int id);//single book
		List<Book>getAllBooks();//for all book
		Long getBookCount();//count
		List<Book>getauthorbooks(String author);//prticular
		List<Book>getbookbytitle(String title);
		List<Book>getbookbyprice(double low ,double high);

}
