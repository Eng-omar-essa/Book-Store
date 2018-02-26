/**
 * 
 */
package com.bookstore.repositry;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.Book;

/**
 * @author Omar Issa
 *
 */
public interface BookRepository extends CrudRepository<Book, Long> {
	
	List<Book> findByTitleContaining(String keyword);

}
