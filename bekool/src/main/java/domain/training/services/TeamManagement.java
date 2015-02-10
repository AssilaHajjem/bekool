package domain.training.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

	@Override
	public Team findTeamByPlayerId(Integer id) {
		Team team = null;
		Player player = entityManager.find(Player.class, id);
		System.out.println(player.getTeam().getTeamName());
		String jpql = "select t from Team t where :p in t.players ";

		Query query = entityManager.createQuery(jpql);
		query.setParameter("p", player);
		// team = (Team) query.getSingleResult();
		return team;
	}

	@Override
	public Team findTeamById(Integer id) {

		return entityManager.find(Team.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Player> findPlayersByTeam(Team team) {
		List<Player> players = new ArrayList<Player>();
		String jpql = "select p from Player p where p.team= " + team;
		Query query = entityManager.createQuery(jpql);
		players = query.getResultList();
		return players;
	}

}
