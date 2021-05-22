import Abstract.CustomerService;
import Entities.CorporateCustomer;
import Entities.ForeignCustomer;
import Entities.LocalCustomer;
import Concrete.LocalCustomerManager;
import Concrete.FileLogger;

public class App {
    public static void main(String[] args) throws Exception {
       //Game game1=new Game(1,"Call of Duty",400,10);
		//Game game2=new Game(2,"Fifa 21",300,10);
		//Game game3=new Game(3,"Gta 5",200,10);
		//Game[] games= {game1,game2,game3};
		//BaseGameManager gameManager=new GameComputerManager();
		//gameManager.addMultiple(games);
		
		LocalCustomer customer1=new LocalCustomer();
		customer1.setCustomerNumber(1234);
		customer1.setFirstName("Rıdvan");
		customer1.setLastName("Abay");
		customer1.setDateOfBirthYear(1993);
		customer1.setNationalIdentity("11443845684");
		customer1.setEmail("ridvanabay@gmail.com");
		
		ForeignCustomer customer2=new ForeignCustomer();
		customer2.setCustomerNumber(4567);
		customer2.setFirstName("Lionel");
		customer2.setLastName("Messi");
		customer2.setDateOfBirthYear(1987);
		customer2.setPassportNumber("000100200");
		customer2.setEmail("lionelmessi@gmail.com");
		
		CorporateCustomer customer3=new CorporateCustomer();
		customer3.setCompanyName("A Corporate");
		customer3.setCustomerNumber(9999);
		customer3.setEmail("corporatecustomer@gmail.com");
		customer3.setTaxNumber("1234567890");
		
		CustomerService customerManager=new LocalCustomerManager(new FileLogger());
		customerManager.add(customer1);
		customerManager.add(customer2);
		customerManager.add(customer3);
		//CustomerManager customerManager=new CustomerManager(new MernisServiceAdapter());
		//customerManager.add(customer1);
    }
}
