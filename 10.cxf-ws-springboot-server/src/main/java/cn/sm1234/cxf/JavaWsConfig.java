package cn.sm1234.cxf;

import javax.xml.ws.Endpoint;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.Bus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import cn.sm1234.services.UserService;

public class JavaWsConfig {
	
	@Autowired
	private Bus bus;
	
	@Autowired
	private UserService userService;
	
	@Bean
	public Endpoint createEndpoint() {
		Endpoint endpoint = new EndpointImpl(bus,userService);
		endpoint.publish("/userService");
		return endpoint;
		
	}

}
