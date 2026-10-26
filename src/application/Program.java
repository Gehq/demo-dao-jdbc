package application;

import java.util.Date;

import Model_Entities.Department;
import Model_Entities.Seller;

public class Program {
	public static void main(String []args) {
		
		Department obj  = new Department(1,"Books");
		
		Seller seller = new Seller(21,"Bob","Bob@gmail.com",new Date(),3000.0,obj);
		
		System.out.println(seller);
	}
}
