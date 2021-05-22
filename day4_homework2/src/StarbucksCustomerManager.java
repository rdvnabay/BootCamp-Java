public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.add(customer);
		} else {
			System.out.println("Not a valid person!");
		}
	}
}
