package com.occamsrazor.web.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.occamsrazor.web.util.Message;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired	UserService userService;

	@PostMapping("/singup")
	public Message add(@RequestBody User user) {
		
		return (userService.add(user))? Message.SUCCESS:Message.FAIL;
	}
	
	@GetMapping("/list")
	public List<User> list(){
		return userService.list();
	}
	@PostMapping("/login")
	public Message login(@RequestBody User user) {
		return (userService.login(user))? Message.SUCCESS :Message.FAIL;
	}
	
	@GetMapping("/detail/{userid}")
	public User detail(@PathVariable String userid) {
		return userService.detail(userid);
	}
	
}
