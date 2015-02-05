package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import domain.training.services.ProjectManagmentRemote;

public class TestInitTrainigDb {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();

		ProjectManagmentRemote proxy = (ProjectManagmentRemote) context
				.lookup("/bekool/ProjectManagment!domain.training.services.ProjectManagmentRemote");

		proxy.init();
	}
}
