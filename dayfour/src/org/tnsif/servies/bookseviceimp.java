package org.tnsif.servies;

import java.util.List;

import org.tnsif.dao.BookDao;
import org.tnsif.dao.Bookimpl;
import org.tnsif.enities.Book;

public class bookseviceimp implements BookServies {

	private BookDao dao;
	
	
	public bookseviceimp() {
		dao=new Bookimpl();
	}

	@Override
	public Book getBookById(int id) {
	
		return dao.getBookById(id);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return dao.getAllBooks();
	}

	@Override
	public Long getBookCount() {
		// TODO Auto-generated method stub
		return dao.getBookCount();
	}

	@Override
	public List<Book> getauthorbooks(String author) {
		// TODO Auto-generated method stub
		return dao.getauthorbooks(author);
	}

	@Override
	public List<Book> getbookbytitle(String title) {
		// TODO Auto-generated method stub
		return dao.getbookbytitle(title);
	}

	@Override
	public List<Book> getbookbyprice(double low, double high) {
		// TODO Auto-generated method stub
		return dao.getbookbyprice(low, high);
	}

}
