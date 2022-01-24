package concrete;

import abstracts.BaseCustomerManager;
import abstracts.ICustomerCheckService;
import entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	public StarbucksCustomerManager() {
		super();
	}

	@Override
	public void Save(Customer customer) throws Exception {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}else {
			System.out.println("Person is not a valid one");
		}
		
	}

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
}
