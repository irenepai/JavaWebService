package cn.sm1234.test;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;


import cn.sm1234.services.UserService;
import cn.sm1234.services.impl.UserServicesImpl;

public class ServerDemo {
	
	public static void main(String[] args) {
		
		//1 create factory
		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
		//2. assign parameter
		//2.1 
		factory.setAddress("http://localhost:8888/userService");
		//2.2
		factory.setServiceClass(UserService.class);
		//2.3
		factory.setServiceBean(new UserServicesImpl());
		//3. 
		
		//interceptor
		factory.getInInterceptors().add(new LoggingInInterceptor());
		factory.getOutInterceptors().add(new LoggingOutInterceptor());
		
		factory.create();

		System.out.println("Web Service Deploy Success....");
	}

}
