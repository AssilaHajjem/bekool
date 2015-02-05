package services.interfaces;

import javax.ejb.Remote;

import domain.User;

@Remote
public interface UserServicesRemote {
	Boolean addUser(User user);

	Boolean deleteUser(Integer id);

	Boolean updateUser(User user);

	User findUserById(Integer id);
}
