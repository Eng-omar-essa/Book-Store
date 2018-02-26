/**
 * 
 */
package com.bookstore.services.imp;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookstore.domain.security.User;
import com.bookstore.domain.security.UserRole;
import com.bookstore.repositry.RoleRepositry;
import com.bookstore.repositry.UserRepository;
import com.bookstore.services.UserService;

/**
 * @author ome
 *
 */
@Service
public class UserServiceImp implements UserService {
	
	private static final Logger log = LoggerFactory.getLogger(UserServiceImp.class); 
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepositry roleRepositry;

	@Transactional
	public User createUser(User user, Set<UserRole> userRole) {
		User localUser = userRepository.findByUsername(user.getUsername());
		if(localUser != null) {
			log.info("user with username {} already exisit ,Nothing will be done", user.getUsername());
			
		}else {
			for (UserRole ur : userRole) {
				roleRepositry.save(ur.getRole());
				
			}
			
			user.getUserRole().addAll(userRole);
			localUser = userRepository.save(user);
		}
		
		return localUser;
	}

}
