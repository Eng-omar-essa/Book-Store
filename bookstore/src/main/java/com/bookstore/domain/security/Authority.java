/**
 * 
 */
package com.bookstore.domain.security;

import java.io.Serializable;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author ome
 *
 */
public class Authority implements GrantedAuthority , Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8500054277948601802L;

	private final String authority;

	
	
	public Authority(String authority) {
		this.authority = authority;
	}



	@Override
	public String getAuthority() {
		return authority;
	}


	

}
