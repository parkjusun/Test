package com.occamsrazor.web.admin;

import java.util.List;

public interface AdminService {

	public void add(Admin admin);

	public List<Admin> fineAll();

	public Admin fideOne(String employNumber);

	public void modify(Admin admin);

	public void remove(Admin admin);
	
}
