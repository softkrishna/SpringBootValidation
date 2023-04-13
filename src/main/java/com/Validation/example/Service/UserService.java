package com.Validation.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Validation.example.Repository.UserRepository;
import com.Validation.example.Throwexception.UsernotFoundException;
import com.Validation.example.dta.UserRequst;
import com.Validation.example.entity.User;

@Service
public class UserService {
	@Autowired
private UserRepository userRepo;
	

public User saveUser(UserRequst urequest) {
	User user=new User(0,urequest.getEmail() , urequest.getGender(), 
			urequest.getMobail(), urequest.getName(), urequest.getAge(),urequest.getNationality());
	return userRepo.save(user);
	
}
public List<User> getAll(){
	return userRepo.findAll();
	
}
public User getUser(int id) throws UsernotFoundException {
	User user=userRepo.findByUserId(id);
	if(user!=null){
	return user;
	}
	else {
		throw new UsernotFoundException("user not found with id :" +id);
	}
	
}
}
