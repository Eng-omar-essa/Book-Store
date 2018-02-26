/**
 * 
 */
package com.bookstore.services;

import java.util.List;

import com.bookstore.domain.Book;

/**
 * @author Omar Issa
 *
 */
public interface BookService {
	List<Book> findAll();

	Book findOne(Long id);

	Book save(Book book);

	List<Book> blurrySearch(String title);

	void removeOne(Long id);
}
