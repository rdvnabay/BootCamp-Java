package abstractDemo;

public class CustomerManager {
	//Strateji Design Pattern
	BaseDatabaseManager baseDatabaseManager;
	
public void getCustomers() {
	baseDatabaseManager.getData();
}
}
