package abstracts;

import entities.Customer;

public abstract class BaseCustomerManager implements ICustomerCheckService{

	public void Save(Customer customer) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Saved to db : "+ customer.getFirstName());
	}

}
