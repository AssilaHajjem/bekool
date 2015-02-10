package testPlatform;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import domain.training.Player;
import domain.training.Team;
import domain.training.services.TeamManagementRemote;

public class TestTeamManagement {

	private Context context;
	private TeamManagementRemote proxy;

	@Before
	public void init() {
		try {
			context = new InitialContext();
			proxy = (TeamManagementRemote) context
					.lookup("/bekool/TeamManagement!domain.training.services.TeamManagementRemote");

		} catch (NamingException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testAddTeam() {
		Team team = new Team();
		team.setTeamName("soulahfet");
		Assert.assertTrue(proxy.AddTeam(team));

	}

	@Test
	public void testAddPlayer() {
		Player player = new Player();
		player.setName("charrouz");
		Assert.assertTrue(proxy.AddPlayer(player));

	}

}
