package com.tripeasy.web.TripEasy.loginservice;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.tripeasy.web.TripEasy.entity.User;
import com.tripeasy.web.TripEasy.repository.RoleRepository;
import com.tripeasy.web.TripEasy.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }


	@Override
	public User findByMobileNumber(Long mobileNumber) {
		// TODO Auto-generated method stub
		return userRepository.findByMobileNumber(mobileNumber);
	}

	@Override
	public User findByEmail(String email) {
		
		return userRepository.findByEmail(email);
	}
}
