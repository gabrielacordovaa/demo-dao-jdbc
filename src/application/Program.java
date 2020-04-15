package application;

import java.util.Date;
import java.util.Scanner;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "bob", "bob@gmail", new Date(), 3000.0, obj);
		
		System.out.println(seller);
	
		sc.close();
	}
}
