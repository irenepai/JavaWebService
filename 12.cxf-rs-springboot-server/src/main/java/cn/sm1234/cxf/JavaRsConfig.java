package cn.sm1234.cxf;

import javax.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import cn.sm1234.services.UserService;

public class JavaRsConfig {
	
	@Autowired
	private Bus bus;
	
	@Autowired
	private UserService userService;
	
	
	@Bean
    public Server createdServer(){
        JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();

        //�]�w�X�ݦa�}
        endpoint.setAddress("/userService");
        //�]�wbus
        endpoint.setBus(bus);
        //�]�w����������
        endpoint.setServiceBean(userService);
        return endpoint.create();
    }

}
