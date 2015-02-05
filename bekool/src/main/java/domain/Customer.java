package domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Customer
 *
 */
@Entity
public class Customer extends User implements Serializable {

	private Float cash;
	private static final long serialVersionUID = 1L;

	public Customer() {
		super();
	}

	public Float getCash() {
		return this.cash;
	}

	public void setCash(Float cash) {
		this.cash = cash;
	}

	public Customer(String name, String login, String password, Float cash) {
		this.cash = cash;
		this.setLogin(login);
		this.setName(name);
		this.setPassword(password);
	}

}
