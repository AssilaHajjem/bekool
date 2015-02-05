package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.interfaces.UserServicesRemote;
import domain.Manager;

public class TestAddManager {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		UserServicesRemote proxy = (UserServicesRemote) context
				.lookup("/bekool/UserServices!"
						+ UserServicesRemote.class.getCanonicalName());

		Manager manager = new Manager();
		manager.setName("sala7");

		proxy.addUser(manager);
	}

}
