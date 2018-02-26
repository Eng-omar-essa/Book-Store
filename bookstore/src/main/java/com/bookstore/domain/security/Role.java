/**
 * 
 */
package com.bookstore.domain.security;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author ome
 *
 */
@Entity
public class Role implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1903012310438625237L;

	@Id
	private Integer roleId;
	
	private String name; 
	
	@OneToMany(mappedBy = "role", cascade = CascadeType.ALL, fetch= FetchType.LAZY)
	private Set<UserRole> userRole = new HashSet<>() ;
	
	public Role() {
		
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<UserRole> getUserRole() {
		return userRole;
	}

	public void setUserRole(Set<UserRole> userRole) {
		this.userRole = userRole;
	}

	
	
}
