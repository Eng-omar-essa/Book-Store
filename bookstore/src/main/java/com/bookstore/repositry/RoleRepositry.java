/**
 * 
 */
package com.bookstore.repositry;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.security.Role;

/**
 * @author ome
 *
 */
public interface RoleRepositry extends CrudRepository<Role, Long>  {

}
