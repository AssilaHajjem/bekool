package domain.training.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import domain.training.Player;
import domain.training.Team;

/**
 * Session Bean implementation class TeamManagement
 */
@Stateless
public class TeamManagement implements TeamManagementRemote,
		TeamManagementLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public TeamManagement() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean AddPlayer(Player player) {
		Boolean b = false;
		try {
			entityManager.persist(player);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean AddTeam(Team team) {
		Boolean b = false;
		try {
			entityManager.persist(team);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

}
