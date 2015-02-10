package domain.training.services;

import java.util.List;

import javax.ejb.Remote;

import domain.training.Player;
import domain.training.Team;

@Remote
public interface TeamManagementRemote {

	Boolean AddPlayer(Player player);

	Boolean AddTeam(Team team);

	Team findTeamByPlayerId(Integer id);

	Team findTeamById(Integer id);

	List<Player> findPlayersByTeam(Team team);
}
