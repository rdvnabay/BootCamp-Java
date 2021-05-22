public class App {
    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer =new Customer();
		customer.setId(1);
		customer.setFirstName("Rıdvan");
		customer.setLastName("Abay");
		customer.setNationalIdentity("12345678900");
		customer.setDateOfYear(1993);
		customerManager.add(customer);
    }
}
