package com;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
//@Cacheable
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String brand;
	private String color;

	// MappedbY take responsible to maintain a relationship
	// @OneToOne(cascade =
	// {CascadeType.PERSIST,CascadeType.REMOVE,CascadeType.MERGE})
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "eid")
	private Enginee enginee;

	public Enginee getEnginee() {
		return enginee;
	}

	public void setEnginee(Enginee enginee) {
		this.enginee = enginee;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
