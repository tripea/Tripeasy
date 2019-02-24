package com.tripeasy.web.TripEasy.loginservice;

import com.tripeasy.web.TripEasy.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);

	User findByMobileNumber(Long mobileNumber);
	
	 User findByEmail(String email);
}
