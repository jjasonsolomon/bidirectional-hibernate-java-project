package com.hibernate.bidir;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	
	public static void main(String...args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("per");
		EntityManager em= emf.createEntityManager();
		em.getTransaction().begin();
	        Student student = new Student("Sam","Disilva","Maths");
	        Address address = new Address("10 Silver street","NYC","USA");
	        student.setAddress(address);
	        address.setStudent(student);
			em.persist(student);
			em.persist(address);
			em.getTransaction().commit();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       

//	        List<Student> students = (List<Student>)em.createQuery("from Student ").list();
//	        for(Student s: students){
//	            System.out.println("Details : "+s);
//	        }
	         
	        
	}
	


}
