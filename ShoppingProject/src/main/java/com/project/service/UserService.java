package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.project.dao.UserDAO;
import com.project.model.User;

@Service
@Configuration
@EnableWebMvc
public class UserService {
	
	@Autowired
    private UserDAO userDAO;
	
	@Transactional(readOnly = true)
    public List<User> getAllUser() {
      return userDAO.getAll(User.class);
    }

}
