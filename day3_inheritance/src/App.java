public class App {
    public static void main(String[] args) throws Exception {
        IndividualCustomer bireyselMusteri = new IndividualCustomer();
        bireyselMusteri.setCustomerNumber("B1234");

        CorporateCustomer kurumsalMusteri = new CorporateCustomer();
        kurumsalMusteri.setCustomerNumber("K1234");

        SendikaCustomer sendikaMusteri = new SendikaCustomer();
        sendikaMusteri.setCustomerNumber("S1234");

        CustomerManager customerManager = new CustomerManager();
        // add
        customerManager.add(bireyselMusteri);
        customerManager.add(kurumsalMusteri);
        customerManager.add(sendikaMusteri);

        System.out.println("-------------------");
        // multiple add
        Customer[] customers = { bireyselMusteri, kurumsalMusteri, sendikaMusteri };
        customerManager.addMultiple(customers);
    }
}
