package com;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveCourseStudent {
	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setName("Priya");
		student1.setEmail("priya@email.com");
		
		Student student2 = new Student();
		student2.setName("Raju");
		student2.setEmail("raj@email.com");
		
		Student student3 = new Student();
		student3.setName("Anil");
		student3.setEmail("ani@email.com");
		
		Course course1 = new Course();
		course1.setName("Java");
		course1.setDuration(8);
		
		Course course2 = new Course();
		course2.setName("HTML");
		course2.setDuration(5);
		
		Course course3 = new Course();
		course3.setName("CSS");
		course3.setDuration(3);
		
		List<Course> courses1 = new ArrayList<Course>();
		courses1.add(course1);
		courses1.add(course2);
		
		List<Course> courses2 = new ArrayList<Course>();
		courses2.add(course1);
		courses2.add(course3);
		
		List<Course> courses3 = new ArrayList<Course>();
		courses3.add(course1);
		courses3.add(course2);
		courses3.add(course3);
		
		List<Student> students1 = new ArrayList<Student>();
		students1.add(student1);
		students1.add(student2);
		students1.add(student3);
		
		List<Student> students2 = new ArrayList<Student>();
		students2.add(student1);
		students2.add(student3);
		
		List<Student> students3 = new ArrayList<Student>();
		students3.add(student2);
		students3.add(student3);
		
		course1.setStudents(students1);
		course2.setStudents(students2);
		course3.setStudents(students3);
		
//		student1.setCourses(courses1);
//		student2.setCourses(courses2);
//		student3.setCourses(courses3);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(student3);
		entityManager.persist(course1);
		entityManager.persist(course2);
		entityManager.persist(course3);
		entityTransaction.commit();
	}
}
