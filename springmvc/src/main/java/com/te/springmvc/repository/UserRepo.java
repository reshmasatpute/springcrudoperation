package com.te.springmvc.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.springmvc.User;

@Repository
public class UserRepo {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("user");
	EntityManager createEntityManager = factory.createEntityManager();
	EntityTransaction transaction = createEntityManager.getTransaction();

	public void saveUser(User user) {

		transaction.begin();
		createEntityManager.persist(user);
		transaction.commit();
	}

	public User getData(String username) {
     transaction.begin();
     User user = createEntityManager.find(User.class, username);
     transaction.commit();
	return user;
	}

	public String delete(String username) {
		createEntityManager.remove(username);
		transaction.commit();
		return username+"deleted";
		
	}
	
	public User update( User user) {
	System.out.println(	user.getEmail() +" from repo");
		User user2 = createEntityManager.find(User.class, user.getEmail());
		//System.out.println(user2);
		//user2.setEmail(user.getEmail());
		user2.setUsername(user.getUsername());
		transaction.begin();
		createEntityManager.persist(user2);
		transaction.commit();
		return user2;
		
	}

	public void delete(User user) {
		User find = createEntityManager.find(User.class,user.getEmail());
		//System.out.println(find);
		createEntityManager.remove(find);
		transaction.begin();
		transaction.commit();
	}
}
