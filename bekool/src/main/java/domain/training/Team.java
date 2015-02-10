package domain.training;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Team
 *
 */
@Entity
public class Team implements Serializable {

	private Integer idTeam;
	private String teamName;
	private static final long serialVersionUID = 1L;

	private List<Player> players;

	public Team() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdTeam() {
		return this.idTeam;
	}

	public void setIdTeam(Integer idTeam) {
		this.idTeam = idTeam;
	}

	public String getTeamName() {
		return this.teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@OneToMany(mappedBy = "team", cascade = CascadeType.PERSIST)
	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public void linkPlayersToThisTeam(List<Player> players) {
		this.players = players;
		for (Player p : players) {
			p.setTeam(this);

		}

	}

}
