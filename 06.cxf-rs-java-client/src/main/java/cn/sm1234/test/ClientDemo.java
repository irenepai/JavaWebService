package cn.sm1234.test;

import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import cn.sm1234.domain.User;

public class ClientDemo {

	@Test
	public void testSaveUser() {
		WebClient
			.create("http://localhost:8888/userService")
			.post(new User(3,"Frank","Male"));
	}
	
	@Test
	public void testUpdateUser() {
		WebClient
			.create("http://localhost:8888/userService")
			.put(new User(3,"Frank","Male"));
	}
	
	@Test
	public void testFindAllUser() {
		List<User> users = (List<User>) WebClient
			.create("http://localhost:8888/userService")
			.getCollection(User.class);
		for(User u : users){
			System.out.println(u);
		}
	}
	
	@Test
	public void testFindById() {
		User user = WebClient
			.create("http://localhost:8888/userService/10")
			.accept(MediaType.APPLICATION_JSON)
			.get(User.class);
		System.out.println("FindById:"+user);
	}
	
	@Test
	public void testDeleteById() {
		WebClient
			.create("http://localhost:8888/userService/10")
			.delete();
	}

}
