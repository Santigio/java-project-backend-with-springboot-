//Author: Pacifique Linda Ikirezi  & Santigie Sankoh
package com.alufinalsummativeproject.repository;

import org.springframework.data.repository.CrudRepository;

import com.alufinalsummativeproject.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}
