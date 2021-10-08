package cn.sm1234.test;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import cn.sm1234.services.UserService;
import cn.sm1234.services.impl.UserServicesImpl;

public class ServerDemo {

	public static void main(String[] args) {
		//1 create factory
		JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();
		//2. assign parameter
		//2.1 
		factory.setAddress("http://localhost:8888/userService");
		//2.2
		factory.setServiceBean(new UserServicesImpl());
		//3. 
		factory.create();
		System.out.println("Restful Web Service Deploy Success....");
	}

}
