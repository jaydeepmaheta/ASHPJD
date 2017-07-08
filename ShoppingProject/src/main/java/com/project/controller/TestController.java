package com.project.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.User;
import com.project.service.UserService;




@RestController
@RequestMapping("/testmap")
public class TestController {
	
	@Autowired
    private UserService userService;
	
	@RequestMapping(value="/test", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<User> testMethod(){
		try{
			System.out.println("--------------inside testmethod----------------------------");
			return userService.getAllUser();
 		}catch(Exception e){
			System.out.println("Exception Occur = "+e);
			return null;
		}
		
		
	}

}