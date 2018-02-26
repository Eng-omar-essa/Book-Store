/**
 * 
 */
package com.bookstore.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bookstore.domain.security.User;
import com.bookstore.repositry.UserRepository;

/**
 * @author ome
 *
 */
@Service
public class UserSecuirtyService implements UserDetailsService {

	private static final Logger log = LoggerFactory.getLogger(UserSecuirtyService.class);
	
	@Autowired
	private UserRepository userRepositry;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepositry.findByUsername(username);
		if(user == null) {
			log.warn("username {} is not found" + username );
			throw new UsernameNotFoundException("username" + username +" not found");
		}
		return user;
	}
	
}
