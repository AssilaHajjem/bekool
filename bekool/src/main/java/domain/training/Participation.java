package domain.training;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Participation
 *
 */
@Entity
public class Participation implements Serializable {

	private ParticipationId participationId;
	private String role;
	private static final long serialVersionUID = 1L;

	private Employee employee;
	private Project project;

	public Participation() {
		super();
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@EmbeddedId
	public ParticipationId getParticipationId() {
		return participationId;
	}

	public void setParticipationId(ParticipationId participationId) {
		this.participationId = participationId;
	}

	@ManyToOne
	@JoinColumn(name = "idEmployee", referencedColumnName = "id", updatable = false, insertable = false)
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@ManyToOne
	@JoinColumn(name = "idProject", referencedColumnName = "id", updatable = false, insertable = false)
	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Participation(String role, Employee employee, Project project,
			Date dateOfParticipation) {
		this.participationId = new ParticipationId(employee.getId(),
				project.getId(), dateOfParticipation);
		this.role = role;
		this.employee = employee;
		this.project = project;
	}

}
