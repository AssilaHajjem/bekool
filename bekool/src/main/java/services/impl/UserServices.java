package services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import services.interfaces.UserServicesLocal;
import services.interfaces.UserServicesRemote;
import domain.User;

/**
 * Session Bean implementation class UserServices
 */
@Stateless
public class UserServices implements UserServicesRemote, UserServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public UserServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addUser(User user) {

		Boolean b = false;
		try {
			entityManager.persist(user);
			b = true;

		} catch (Exception e) {
			System.err.println("insertion failure");

		}
		return b;
	}

	@Override
	public Boolean deleteUser(Integer id) {
		Boolean b = false;
		try {
			entityManager.remove(entityManager.find(User.class, id));
			b = true;

		} catch (Exception e) {
			System.err.println("insertion failure");

		}
		return b;
	}

	@Override
	public Boolean updateUser(User user) {
		Boolean b = false;
		try {
			entityManager.merge(user);
			b = true;

		} catch (Exception e) {
			System.err.println("insertion failure");

		}
		return b;
	}

	@Override
	public User findUserById(Integer id) {
		return entityManager.find(User.class, id);
	}

}
