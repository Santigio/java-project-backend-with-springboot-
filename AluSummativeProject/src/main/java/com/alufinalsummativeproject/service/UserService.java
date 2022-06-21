//Author: Pacifique Linda Ikirezi  & Santigie Sankoh
package com.alufinalsummativeproject.service;

import java.util.Set;

import com.alufinalsummativeproject.domain.User;
import com.alufinalsummativeproject.domain.security.PasswordResetToken;
import com.alufinalsummativeproject.domain.security.UserRole;

public interface UserService {
	PasswordResetToken getPasswordResetToken(final String token);
	
	void createPasswordResetTokenForUser(final User user, final String token);

	User findByUsername(String username);
	
	User findByEmail (String email);
	
	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
}