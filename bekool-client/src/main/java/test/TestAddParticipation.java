package test;

import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import domain.training.Employee;
import domain.training.Project;
import domain.training.services.ProjectManagmentRemote;

public class TestAddParticipation {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();

		ProjectManagmentRemote proxy = (ProjectManagmentRemote) context
				.lookup("/bekool/ProjectManagment!domain.training.services.ProjectManagmentRemote");

		Employee employee = proxy.findEmployeeById(1);
		Employee employee2 = proxy.findEmployeeById(2);

		Project project = proxy.findProjectById(1);

		// proxy.addParticipation(employee, project, "executive manager",
		// new Date());
		proxy.addParticipation(employee2, project, "executive manager",
				new Date());

	}
}
