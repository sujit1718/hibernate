package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.cache.spi.support.EntityTransactionalAccess;

public class EmployeeDelete {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sujit");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Employee employee = manager.find(Employee.class, 4);
		
		if(employee!=null) {
		transaction.begin();
		manager.remove(employee);
		transaction.commit();
		}else {
			System.out.println("Id not found!!");
		}
	}

}
