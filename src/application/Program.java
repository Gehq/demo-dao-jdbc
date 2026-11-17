package application;
import java.util.Date;
import java.util.Date;
import java.util.List;

import Model_Entities.Department;
import Model_Entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {
	public static void main(String []args) {
		
		//Department obj  = new Department(1,"Books");
		
		//Seller seller = new Seller(21,"Bob","Bob@gmail.com",new Date(),3000.0,obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
				
		System.out.println("===TEST 1: Seller FindById===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n===TEST 2: Seller FindByDepartment===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n===TEST 3: Seller FindAll===");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n===TEST 4: seller insert===");
		Seller newSeller = new Seller(null,"Greg","greg@gmail.com",new Date(),4000.0,department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted!" + newSeller.getId());
		
	}
}
