package interfaces;

public class Main {

	public static void main(String[] args) throws Exception {
		ICustomerDal customerDal=new OracleCustomerDal();
		customerDal.add();
			
		CustomerManager customerManager =new CustomerManager(new MySqlCustomerDal());
		customerManager.add();
	}
}
