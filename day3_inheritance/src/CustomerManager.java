public class CustomerManager {
public void add(Customer customer) {
	System.out.println(customer.getCustomerNumber()+" eklendi");
}

public void addMultiple(Customer[] customers) {
	for(Customer customer:customers) {
		add(customer);
	}
}
}
