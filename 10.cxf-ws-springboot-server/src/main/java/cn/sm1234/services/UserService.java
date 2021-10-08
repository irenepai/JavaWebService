package cn.sm1234.services;

import java.util.List;

import javax.jws.WebService;

import cn.sm1234.domain.User;

/*
 * @WebService �⦹���е���web service��interface
 * �ݦbJDK 1.6�H�W
 */

@WebService
public interface UserService {
	
	public void SaveUser(User user);
	public void UpdateUser(User user);
	public void DeleteUser(Integer id) ;
    public List<User> FindAllUser();
    public User FindById(Integer id);
	

}
