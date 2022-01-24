package Main;

import adapters.MernisServiceAdapter;
import abstracts.BaseCustomerManager;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception{
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		Customer customer = new Customer(1, "Melissa", "Vargas", 2000 , "11111111111");

		customerManager.Save(customer);

	}

}
