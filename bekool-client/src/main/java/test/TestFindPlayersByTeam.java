package test;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import domain.training.Player;
import domain.training.Team;
import domain.training.services.TeamManagementRemote;

public class TestFindPlayersByTeam {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		TeamManagementRemote proxy = (TeamManagementRemote) context
				.lookup("/bekool/TeamManagement!domain.training.services.TeamManagementRemote");

		Team team = proxy.findTeamById(1);
		List<Player> players = proxy.findPlayersByTeam(team);
		for (Player p : players) {
			System.out.println(p.getName());
		}
	}

}
