package domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Table
 *
 */
@Entity
public class Tavola implements Serializable {

	private Integer num;
	private Boolean vip;
	private Integer placeNumber;
	private Boolean busy = true;
	private static final long serialVersionUID = 1L;

	public Tavola() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getNum() {
		return this.num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Boolean getVip() {
		return this.vip;
	}

	public void setVip(Boolean vip) {
		this.vip = vip;
	}

	public Integer getPlaceNumber() {
		return this.placeNumber;
	}

	public void setPlaceNumber(Integer placeNumber) {
		this.placeNumber = placeNumber;
	}

	public Tavola(Boolean vip, Integer placeNumber) {
		this.vip = vip;
		this.placeNumber = placeNumber;
	}

	public Boolean getBusy() {
		return busy;
	}

	public void setBusy(Boolean busy) {
		this.busy = busy;
	}

}
