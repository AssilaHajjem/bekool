package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.interfaces.UserServicesRemote;

public class TestDeleteUser {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		UserServicesRemote proxy = (UserServicesRemote) context
				.lookup("/bekool/UserServices!"
						+ UserServicesRemote.class.getCanonicalName());

		proxy.deleteUser(2);
	}

}
