package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.interfaces.UserServicesRemote;
import domain.User;

public class TestUpdateUser {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		UserServicesRemote proxy = (UserServicesRemote) context
				.lookup("/bekool/UserServices!"
						+ UserServicesRemote.class.getCanonicalName());

		User user = proxy.findUserById(3);
		user.setName("loulou");

		proxy.updateUser(user);
	}

}
