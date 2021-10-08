package cn.sm1234.test;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import cn.sm1234.domain.User;
import cn.sm1234.services.UserService;

public class ClientDemo {

	public static void main(String[] args) {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setAddress("http://localhost:8080/10.cxf-ws-springboot-server/services/userService");
		factory.setServiceClass(UserService.class);
		UserService userService = (UserService)factory.create();
		Client client = ClientProxy.getClient(userService);
		client.getInInterceptors().add(new LoggingInInterceptor());
		client.getOutInterceptors().add(new LoggingOutInterceptor());
		userService.SaveUser(new User(1,"¤p±i","¨k"));
		                   
		

	}

}
