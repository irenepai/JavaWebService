package cn.sm1234.services;

import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cn.sm1234.domain.User;

/*
 * @WebService 把此類標註為web service的interface
 * 需在JDK 1.6以上
 */


public interface UserService {
	
	@POST
	public void SaveUser(User user);
	@PUT
	public void UpdateUser(User user);
	@DELETE
	@Path("/{id}")
	public void DeleteUser(@PathParam("id")Integer id);
	@GET
    public List<User> FindAllUser();
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
    public User FindById(@PathParam("id")Integer id);
	

}
