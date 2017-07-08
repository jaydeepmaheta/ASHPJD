package com.project.dao;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.project.common.HibernateUtil;

@Repository
@Configuration
@EnableWebMvc
public class UserDAO extends HibernateUtil {

}
