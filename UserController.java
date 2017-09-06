package com.epam.mesos;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private  UserRepository userRepository;
	
	@RequestMapping("/get")
	public void get(){
	//	userRepository.deleteAll();
		User user = saveUser();
		System.out.println(userRepository.findOne(user.getId()));
	}

	private User saveUser() {
		User user = new User();
		user.setId(UUID.randomUUID().toString());
		user.setFirstName("Alice");
		user.setLastName("Smith");
		return userRepository.save(user);
	}

}
