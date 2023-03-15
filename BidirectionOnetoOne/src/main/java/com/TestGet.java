package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestGet {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();

		Car c = em.find(Car.class, 1);
		System.out.println(c.getCid());
		System.out.println(c.getBrand());
		System.out.println(c.getColor());
		System.out.println(c.getEnginee().getEid());
		System.out.println(c.getEnginee().getCc());
		System.out.println(c.getEnginee().getFuelType());
		System.out.println("----------------");
		Car c1 = em.find(Car.class, 1);
		System.out.println(c1.getCid());
		System.out.println(c1.getBrand());
		System.out.println(c1.getColor());
		System.out.println(c1.getEnginee().getEid());
		System.out.println(c1.getEnginee().getCc());
		System.out.println(c1.getEnginee().getFuelType());
	}

}
