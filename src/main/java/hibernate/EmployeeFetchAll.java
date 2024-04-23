package hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class EmployeeFetchAll {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sujit");
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createQuery("SELECT e FROM Employee e");
		List<Employee> list= query.getResultList();
		System.out.println(list);
		
	}

}
