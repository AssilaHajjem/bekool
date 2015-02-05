package test;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.interfaces.ManagmentServicesRemote;
import domain.Tavola;

public class TestFindAllAvailableTables {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		ManagmentServicesRemote proxy = (ManagmentServicesRemote) context
				.lookup("/bekool/ManagmentServices!"
						+ ManagmentServicesRemote.class.getCanonicalName());

		List<Tavola> tavolas = proxy.findAllAvailableTables(8);
		System.out.println(tavolas.size());
	}

}
