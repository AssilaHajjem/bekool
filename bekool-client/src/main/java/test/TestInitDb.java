package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.interfaces.ManagmentServicesRemote;
import services.interfaces.UserServicesRemote;
import domain.Customer;
import domain.Manager;
import domain.Tavola;

public class TestInitDb {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();

		UserServicesRemote proxy = (UserServicesRemote) context
				.lookup("/bekool/UserServices!"
						+ UserServicesRemote.class.getCanonicalName());

		ManagmentServicesRemote proxy2 = (ManagmentServicesRemote) context
				.lookup("/bekool/ManagmentServices!"
						+ ManagmentServicesRemote.class.getCanonicalName());

		Manager manager = new Manager("hamma weld flay", "hamma", "jigly", 200F);

		Customer customer = new Customer("sarra", "sarra", "lamine", 30F);
		Customer customer2 = new Customer("wassim", "wassim", "wess", 130F);
		Customer customer3 = new Customer("pikon", "pikon", "pikon", 1F);

		Tavola table = new Tavola(false, 2);
		Tavola table2 = new Tavola(false, 4);
		Tavola table3 = new Tavola(false, 4);
		Tavola table4 = new Tavola(true, 2);

		proxy.addUser(manager);
		proxy.addUser(customer);
		proxy.addUser(customer2);
		proxy.addUser(customer3);

		proxy2.addTable(table);
		proxy2.addTable(table2);
		proxy2.addTable(table3);
		proxy2.addTable(table4);

	}
}
