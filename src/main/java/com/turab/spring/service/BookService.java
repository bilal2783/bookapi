package com.turab.spring.service;

import java.util.List;

import com.turab.spring.model.Book;

public interface BookService {
	
	//Save the record
	long save(Book book);
	
	//Get a single record
	Book get(long id);
	
	//Get all the records
	List<Book> list();
	
	//Updat the record
	void update(long id, Book book);
	
	//Delete a record
	
	void delete(long id);

}
