//Author: Pacifique Linda Ikirezi  & Santigie Sankoh
package com.alufinalsummativeproject.repository;

import org.springframework.data.repository.CrudRepository;

import com.alufinalsummativeproject.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
	
	User findByEmail(String Email);
}
