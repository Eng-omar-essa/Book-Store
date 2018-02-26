/**
 * 
 */
package com.bookstore.services;

import java.util.Set;

import com.bookstore.domain.security.User;
import com.bookstore.domain.security.UserRole;

/**
 * @author ome
 *
 */
public interface UserService {
	
	User createUser(User user , Set<UserRole> userRole);

}
