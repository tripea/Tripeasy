package com.tripeasy.web.TripEasy.repository;

 import org.springframework.data.jpa.repository.JpaRepository;

import com.tripeasy.web.TripEasy.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);


	User findByMobileNumber(Long mobileNumber);


	User findByEmail(String email);
}
