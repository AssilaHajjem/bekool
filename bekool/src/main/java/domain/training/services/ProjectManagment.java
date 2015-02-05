package domain.training.services;

import java.util.Date;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import domain.training.Employee;
import domain.training.Participation;
import domain.training.Project;

/**
 * Session Bean implementation class ProjectManagment
 */
@Stateless
public class ProjectManagment implements ProjectManagmentRemote {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public ProjectManagment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() {
		Employee employee = new Employee("sala7");
		Employee employee2 = new Employee("sallou7a");

		Project project = new Project("pidev");

		entityManager.persist(employee);
		entityManager.persist(employee2);

		entityManager.persist(project);

	}

	@Override
	public void addParticipation(Employee employee, Project project,
			String role, Date dateOfParticipation) {
		Participation participation = new Participation(role, employee,
				project, dateOfParticipation);
		entityManager.persist(participation);

	}

	@Override
	public Employee findEmployeeById(Integer id) {
		return entityManager.find(Employee.class, id);
	}

	@Override
	public Project findProjectById(Integer id) {
		return entityManager.find(Project.class, id);
	}

}
