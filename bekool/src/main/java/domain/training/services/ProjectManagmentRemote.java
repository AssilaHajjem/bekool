package domain.training.services;

import java.util.Date;

import javax.ejb.Remote;

import domain.training.Employee;
import domain.training.Project;

@Remote
public interface ProjectManagmentRemote {
	void init();

	void addParticipation(Employee employee, Project project, String role,
			Date dateOfParticipation);

	Employee findEmployeeById(Integer id);

	Project findProjectById(Integer id);

}
