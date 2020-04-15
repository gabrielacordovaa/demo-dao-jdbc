package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("TESTES DO DEPARTMENT");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department FindById === ");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		
		System.out.println("\n=== TEST 2: department findAll =======");
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
		System.out.println("\n=== TEST 3: department INSERT === ");
		Department newDep = new Department(null, "COOKER");
		departmentDao.insert(newDep);
		System.out.println("Inserted! New id = " + newDep.getId());
		
		System.out.println("\n=== TEST 4: department UPDATE === ");
		department = departmentDao.findById(1);
		department.setName("Mouse");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 5: department DELETE === ");
		System.out.println("Enter id for delete test");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();

	}

}
