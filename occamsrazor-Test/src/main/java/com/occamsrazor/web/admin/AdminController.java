package com.occamsrazor.web.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.occamsrazor.web.util.Message;

@RestController
@RequestMapping("/member")
public class AdminController {
	@Autowired AdminService adminService;
	
	@PostMapping("/join")
	public Message add(Admin admin) {
		adminService.add(admin);
		
		return Message.SUCCESS;
	}
	
	public List<Admin> list(){
		
		return adminService.fineAll();
	}
	
	public Admin detail(String employNumber) {
		
		return adminService.fideOne(employNumber);
	}
	
	public Message update(Admin admin) {
		adminService.modify(admin);
		return Message.SUCCESS;
	}
	
	public Message delet(Admin admin) {
		adminService.remove(admin);
		return Message.SUCCESS;
	}
}
