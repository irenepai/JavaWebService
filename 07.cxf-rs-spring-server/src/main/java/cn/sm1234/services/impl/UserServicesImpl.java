package cn.sm1234.services.impl;

import java.util.ArrayList;
import java.util.List;

import cn.sm1234.domain.User;
import cn.sm1234.services.UserService;

public class UserServicesImpl implements UserService {

	public void SaveUser(User user) {
		System.out.println("save user:"+user);
	
	}

	public void UpdateUser(User user) {
		System.out.println("update user:"+user);
		
	}

	public void DeleteUser(Integer id) {
		System.out.println("delete user:"+ id);
		
	}

	public List<User> FindAllUser() {
		List<User> users = new ArrayList<User>();
		users.add(new User(1,"Jeff","Male"));
		users.add(new User(2,"Tom","Male"));
		users.add(new User(3,"Mary","Female"));
		
		return  users;
	}

	public User FindById(Integer id) {
		return new User(1,"Jason","Female");
	}

}
