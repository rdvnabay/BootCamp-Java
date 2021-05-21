
public class App {
    public static void main(String[] args) throws Exception {
        CustomerManager customerManager1 = new CustomerManager();
        customerManager1.Add();
        customerManager1.Update();
        customerManager1.Delete();

        // Reference Type
        CustomerManager customerManager2 = new CustomerManager();
        customerManager1 = customerManager2;

        int[] sayilar1 = new int[] { 1, 2, 3 };
        int[] sayilar2 = new int[] { 4, 5, 6 };
        sayilar1 = sayilar2;
        sayilar2[0] = 99;
        System.out.println("sayilar1[0]'in değeri:" + sayilar1[0]);

        // Value Type
        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 30;
        System.out.println("sayı1'in değeri:" + sayi1);

        // Method Overloading
        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.topla(10, 20);
        int sonuc2 = dortIslem.topla(10, 20, 30);
        System.out.println(sonuc);
        System.out.println(sonuc2);

        // Getter Setter, Constructor
        Product product1 = new Product();
        Product product2 = new Product(1, "Iphone", "Akıllı Telefon", 4000, 30, "White");
        product1.setId(1);
        product1.setName("Laptop");
        product1.setDescription("Dizüstü Bilgisayar");
        product1.setPrice(3000);
        product1.setStockAmount(3);
        System.out.println(product1.getCode());
        ProductManager productManager = new ProductManager();
        productManager.add(product1);
        productManager.add(product2);

        // Inheritance
        Customer customer1 = new Customer();
        customer1.firstName = "Rıdvan";
        Employee employee1 = new Employee();
        employee1.lastName = "Abay";

        CustomerManager customerManager3 = new CustomerManager();
        customerManager3.get();
        EmployeeManager employeeManager1 = new EmployeeManager();
        employeeManager1.list();

        // Polymorphism
        KrediUI krediUI = new KrediUI();
        krediUI.krediHesapla(new AskerKrediManager());

        // Polymorphism 2
        //int[] sayilar = new int[] { 1, 2, 3, 4 }; // dizi elemanları int değerinde olmalı
        // dizi elemanları BaseLogger tarafından miras alınmalı
        BaseLogger[] loggers = new BaseLogger[] { new DatabaseLogger(), new FileLogger(), new EmailLogger(),
                new ConsoleLogger() };

        for (BaseLogger logger : loggers) {
            logger.log("log Mesajı");
        }

        UserManager userManager = new UserManager(new FileLogger());
        userManager.add();
    }
}