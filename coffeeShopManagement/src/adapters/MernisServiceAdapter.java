package adapters;

import abstracts.ICustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws Exception {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		
		return proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(),customer.getDateOfBirth());
	}

}
