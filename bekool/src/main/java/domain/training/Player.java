package domain.training;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Player
 *
 */
@Entity
public class Player implements Serializable {

	private Integer idPlayer;
	private String name;
	private static final long serialVersionUID = 1L;

	private Team team;

	public Player() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdPlayer() {
		return this.idPlayer;
	}

	public void setIdPlayer(Integer idPlayer) {
		this.idPlayer = idPlayer;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToOne(cascade = CascadeType.PERSIST)
	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

}
