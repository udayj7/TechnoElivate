package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveMobileSim {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Sim s1 = new Sim();
		s1.setSid(10101);
		s1.setNetwork("4G");
		s1.setProvider("Airtel");

		Sim s2 = new Sim();
		s2.setSid(20202);
		s2.setNetwork("5G");
		s2.setProvider("JIO");

		List<Sim> sims = new ArrayList<Sim>();
		sims.add(s1);
		sims.add(s2);

		Mobile m1 = new Mobile();
		m1.setBrand("IPHONE");
		m1.setColor("White");
		m1.setSim(sims);

		et.begin();
		em.persist(m1);
		em.persist(s1);
		em.persist(s2);
		et.commit();
	}

}
