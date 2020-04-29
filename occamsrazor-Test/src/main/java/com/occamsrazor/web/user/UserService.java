package com.occamsrazor.web.user;

import java.util.List;

public interface UserService {

	public boolean add(User user);
	public List<User> list();
	public boolean login(User user);
	public User detail(String userid);

}
