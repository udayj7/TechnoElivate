package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveCarEnginee {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Enginee e1 = new Enginee();
		e1.setEid(10101);
		e1.setCc("300CC");
		e1.setFuelType("Petrol");

		Enginee e2 = new Enginee();
		e2.setEid(20202);
		e2.setCc("500CC");
		e2.setFuelType("Diesel");

		Enginee e3 = new Enginee();
		e3.setEid(30303);
		e3.setCc("700CC");
		e3.setFuelType("Petrol");

		Car c1 = new Car();
		c1.setBrand("Audi");
		c1.setColor("White");

		Car c2 = new Car();
		c2.setBrand("Innova");
		c2.setColor("Grey");

		Car c3 = new Car();
		c3.setBrand("MG");
		c3.setColor("Black");

		c1.setEnginee(e1);
		e1.setCar(c1);

		c2.setEnginee(e2);
		e2.setCar(c2);

		c3.setEnginee(e3);
		e3.setCar(c3);

		et.begin();
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		et.commit();
		
//		Enginee e1 = new Enginee();
//		e1.setEid(10101);
//		e1.setCc("300CC");
//		e1.setFuelType("Petrol");
//		
//		Car c1 = new Car();
//		c1.setBrand("Audi");
//		c1.setColor("White");
//		
//		e1.setCar(c1);
//		
//		et.begin();
//		em.persist(e1);
////		em.detach(e1);
//		c1.setBrand("Maruthi");
//		em.merge(e1);
//		et.commit();
	}
}
