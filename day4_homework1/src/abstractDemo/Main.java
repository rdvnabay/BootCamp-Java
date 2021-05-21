package abstractDemo;

public class Main {

	public static void main(String[] args) throws Exception {
		CustomerManager customerManager=new CustomerManager();
		customerManager.baseDatabaseManager=new OracleDatabaseManager();
		customerManager.getCustomers();
	}
}
