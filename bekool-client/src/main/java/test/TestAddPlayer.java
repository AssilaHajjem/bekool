package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import domain.training.Player;
import domain.training.Team;
import domain.training.services.TeamManagementRemote;

public class TestAddPlayer {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		TeamManagementRemote proxy = (TeamManagementRemote) context
				.lookup("/bekool/TeamManagement!domain.training.services.TeamManagementRemote");

		Player player = new Player();
		player.setName("charrouz");

		Team team = new Team();
		team.setTeamName("lfarachet");

		player.setTeam(team);

		proxy.AddPlayer(player);
	}

}
