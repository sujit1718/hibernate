package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeUpdate {

	public static void main(String[] args) {

//		Employee employee = new Employee();
//		employee.setId(5);
//		employee.setName("Sudhir");
//		employee.setPhone(9876543211L);
//		employee.setAddress("Latur");
//		
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sujit");
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		
//		Employee employee2 = manager.find(Employee.class, employee.getId());
//		if(employee2!=null) {
//     		transaction.begin();
//	     	manager.merge(employee);
//		    transaction.commit();
//		}else {
//			System.out.println("Id Not Found!!");
//		}
		
		//To Update Specific Data.
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sujit");
		EntityManager manager = factory.createEntityManager();
		Employee employee = manager.find(Employee.class, 1);
		if (employee!=null) {
			employee.setAddress("Latur");
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.merge(employee);
			transaction.commit();
		} else {
            System.out.println("Id Not Found!!");
		}
	}

}
