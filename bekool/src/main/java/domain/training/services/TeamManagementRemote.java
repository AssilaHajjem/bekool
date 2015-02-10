package domain.training.services;

import javax.ejb.Remote;

import domain.training.Player;
import domain.training.Team;

@Remote
public interface TeamManagementRemote {

	Boolean AddPlayer(Player player);

	Boolean AddTeam(Team team);

}
