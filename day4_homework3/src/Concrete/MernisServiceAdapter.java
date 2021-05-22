package Concrete;

// import java.rmi.RemoteException;

// import Abstract.CustomerCheckService;
// import Entities.Customer;
// import Entities.LocalCustomer;
// import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
// import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter //implements CustomerCheckService// {
{
	//@Override
	/*
	public boolean CheckIfRealPerson(LocalCustomer customer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result=true;
		try {
			result=kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirthYear());
		}
		catch (RemoteException e){
			e.printStackTrace();
		}
		return result;
	}
	*/

}
