package services.interfaces;

import javax.ejb.Local;

import domain.User;

@Local
public interface UserServicesLocal {
	Boolean addUser(User user);

	Boolean deleteUser(Integer id);

	Boolean updateUser(User user);

	User findUserById(Integer id);
}
