package cn.sm1234.services;

import java.util.List;

import javax.jws.WebService;

import cn.sm1234.domain.User;

/*
 * @WebService 把此類標註為web service的interface
 * 需在JDK 1.6以上
 */

@WebService
public interface UserService {
	
	public void SaveUser(User user);
	public void UpdateUser(User user);
	public void DeleteUser(Integer id) ;
    public List<User> FindAllUser();
    public User FindById(Integer id);
	

}
