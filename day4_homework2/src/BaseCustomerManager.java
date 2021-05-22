public class BaseCustomerManager implements CustomerService{

	@Override
	public void add(Customer customer) {
		System.out.println("Müşteri eklendi: "+customer.getFirstName());
	}
}