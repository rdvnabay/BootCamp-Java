import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		return false;
		kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()),
		customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
		customer.getDateOfYear());
	}
}
