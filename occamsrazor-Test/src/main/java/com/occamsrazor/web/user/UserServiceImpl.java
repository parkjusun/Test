package com.occamsrazor.web.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{
	public List<User> list;
	
	public UserServiceImpl() {
		list = new ArrayList<>();
	}
	
	@Override
	public boolean add(User user) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		return list.add(user);
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		
		return list;
	}

	@Override
	public boolean login(User user) {
		boolean loginOk = false;
		for (int i = 0; i < list.size(); i++) {
			if (user.getUserid().equals(list.get(i).getUserid()) 
					&& user.getPassword().equals(list.get(i).getPassword())) {
				loginOk = true;
				break;
			}
		}
		return loginOk;
	}

	@Override
	public User detail(String userid) {
		User loginUser = new User();

		for (int i = 0; i < list.size(); i++) {
			if (userid.equals(list.get(i).getUserid())) {
				loginUser = list.get(i);
			}
		}
		return loginUser;
	}
	
	

}
