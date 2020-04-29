package com.occamsrazor.web.admin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.occamsrazor.web.util.Data;

@Repository
public class AdminDaoImpl implements AdminDao {

	@Override
	public void insert(Admin admin) {
		try {
			File file = new File(Data.ADMIN_PATH.toString()+ Data.LIST + Data.CSV);
			BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
			writer.write(admin.toString());
			writer.newLine();
			writer.flush();
			
		} catch (Exception e) {
		}
		
	}

	@Override
	public List<Admin> selectAll() {
		return null;
	}
	
	@Override
	public Admin selectOne(String employNumber) {
		return null;
	}

	@Override
	public void update(Admin admin) {
		
	}

	@Override
	public void delet(Admin admin) {
		
	}

	

}
