public class App {
    public static void main(String[] args) throws Exception {

        Logger[] loggers = { new FileLogger(), new SmsLogger() };
        CustomerManager customerManager = new CustomerManager(loggers);
        Customer customer1 = new Customer(1, "Rıdvan", "Abay");
        customerManager.add(customer1);
    }
}
