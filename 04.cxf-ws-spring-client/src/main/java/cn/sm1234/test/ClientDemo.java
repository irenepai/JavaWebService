package cn.sm1234.test;

import java.util.List;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sm1234.domain.User;
import cn.sm1234.services.UserService;


public class ClientDemo {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) ac.getBean("userService");
		userService.SaveUser(new User(1,"¤p±i","¨k"));
		List<User> users = userService.FindAllUser();
		for(int i = 0;i<users.size();i++) {
			System.out.println(users.get(i));
		}
	}

}
