package com.te.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.te.springmvc.User;
import com.te.springmvc.repository.UserRepo;

@Service
public class UserService {
	@Autowired
	UserRepo repo;

	public boolean check(User user) {
		if (user.getPassword().equals(user.getRetype_password())) {
			repo.saveUser(user);
			return true;
		}
		return false;
	}

	public User getData(String username) {
		User user = repo.getData(username);
		return user;
	}

	public String delete(String username) {
		if (username.equals(username)) {
			return username +"cancelled deletion";
		}
		return username + "deleted";
	}

	public void delete(User user) {
     repo.delete(user);		
	}

	public User updatedata(User user) {
		 User update = repo.update(user);
		return update;
	}

	
}
