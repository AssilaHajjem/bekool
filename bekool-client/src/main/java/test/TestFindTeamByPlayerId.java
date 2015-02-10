package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import domain.training.Team;
import domain.training.services.TeamManagementRemote;

public class TestFindTeamByPlayerId {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		TeamManagementRemote proxy = (TeamManagementRemote) context
				.lookup("/bekool/TeamManagement!domain.training.services.TeamManagementRemote");

		Team team = proxy.findTeamByPlayerId(1);
		System.out.println(team.getTeamName());
	}

}
