/**
 * 
 */
package com.bookstore.repositry;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.security.User;

/**
 * @author ome
 *
 */
public interface UserRepository extends CrudRepository<User, Long> {
	
	User findByUsername(String username);
	User findByEmail(String email);
	List<User> findAll();

}
