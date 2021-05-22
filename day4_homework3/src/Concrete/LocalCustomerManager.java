package Concrete;

import Abstract.CustomerService;
import Entities.Customer;

public class LocalCustomerManager implements CustomerService{

	private BaseLoggerManager logger;
	public LocalCustomerManager(BaseLoggerManager logger) {
		this.logger=logger;
	}


	@Override
	public void add(Customer customer) {
		System.out.println(customer.getCustomerNumber()+" nolu kullanıcı eklendi");
	logger.log();
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getCustomerNumber()+" nolu kullanıcı güncellendi");
		logger.log();
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getCustomerNumber()+" nolu kullanıcı silindi");
		logger.log();
	}

	
}
