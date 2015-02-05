package services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import services.interfaces.ManagmentServicesLocal;
import services.interfaces.ManagmentServicesRemote;
import services.interfaces.UserServicesLocal;
import domain.Tavola;
import domain.User;

/**
 * Session Bean implementation class ManagmentServices
 */
@Stateless
public class ManagmentServices implements ManagmentServicesRemote,
		ManagmentServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;
	@EJB
	private UserServicesLocal userServicesLocal;

	/**
	 * Default constructor.
	 */
	public ManagmentServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addTable(Tavola table) {
		Boolean b = false;
		try {
			entityManager.persist(table);
			b = true;

		} catch (Exception e) {
			System.err.println(" failure");

		}
		return b;
	}

	@Override
	public Tavola bookTable(Integer idUser, Integer placesNumber) {
		Tavola tavola = null;
		User userFound = userServicesLocal.findUserById(idUser);
		try {
			List<Tavola> tavolas=findAllAvailableTables(placesNumber);
			if (tavolas!=null) {
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;
	}

	@Override
	public List<Tavola> findAllAvailableTables(Integer placesNumber) {
		List<Tavola> tavolas = new ArrayList<>();
		String jpql = "select t from Tavola t where t.busy=false and t.placeNumber >= "
				+ placesNumber;
		Query query = entityManager.createQuery(jpql);
		try {
			tavolas = query.getResultList();
		} catch (Exception e) {
			System.out.println("non available ...");
		}
		return tavolas;
	}

}
