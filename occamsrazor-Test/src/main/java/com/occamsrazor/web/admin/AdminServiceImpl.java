package com.occamsrazor.web.admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired AdminDao adminDao;
	
	@Override
	public void add(Admin admin) {
		adminDao.insert(admin);	
	}

	@Override
	public List<Admin> fineAll() {
		
		return adminDao.selectAll();
	}

	@Override
	public Admin fideOne(String employNumber) {
		return adminDao.selectOne(employNumber);
	}

	@Override
	public void modify(Admin admin) {
		adminDao.update(admin);
	}

	@Override
	public void remove(Admin admin) {
		adminDao.delet(admin);
	}
	
	


}
