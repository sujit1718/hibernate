package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import org.hibernate.proxy.EntityNotFoundDelegate;

public class EmployeeInsert {

	public static void main(String[] args) {
	
	Employee employee = new Employee();
	employee.setId(2);
	employee.setName("Nayan");
	employee.setPhone(1234567234L);
	employee.setAddress("Nashik");
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("sujit");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	transaction.begin();
	  manager.persist(employee);
	transaction.commit();
	}
}