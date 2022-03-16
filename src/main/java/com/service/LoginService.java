package com.service;

import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Login;
import com.advices.LoginNotFoundException;
import com.repository.LoginRepository;
@Service
public class LoginService {
	@Autowired
	LoginRepository loginrepository;
	
	public Login addLogin(Login b)
	{
		loginrepository.save(b);
		return b;
	}
	
	public String deleteLogin(Login b)
	{
		loginrepository.delete(b);
		return "Delete Successfully";
	}
	public Login updateLogin(Login b) throws Throwable 
	{
		Supplier s1 = ()-> new LoginNotFoundException("Id does not Exists");
		int id = b.getId();
		Login b1=loginrepository.findById(id).orElseThrow(s1);
		b1.setEmail(b1.getEmail());
		b1.setPassword(b1.getPassword());
		loginrepository.save(b1);
		return b1;
	}
	public Login getById(int id) throws Throwable
	{
		Supplier s1= () -> new LoginNotFoundException("Id not found /Incorrect Id");
		Login b=loginrepository.findById(id).orElseThrow(s1);
		return b;
	}
	public String deleteLoginById(int id) throws Throwable
	{
		Supplier s1= () -> new LoginNotFoundException("Id not found /Incorrect Id");
		loginrepository.deleteById(id);
		return "Delete Successfully";
	}
}


