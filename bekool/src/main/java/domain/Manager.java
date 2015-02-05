package domain;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Manager
 *
 */
@Entity
public class Manager extends User implements Serializable {

	private Float salary;
	private static final long serialVersionUID = 1L;

	public Manager() {
		super();
	}

	public Float getSalary() {
		return this.salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public Manager(String name, String login, String password, Float salary) {
		this.salary = salary;
		this.setLogin(login);
		this.setName(name);
		this.setPassword(password);
	}

}
