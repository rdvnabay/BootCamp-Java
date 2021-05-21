public class Product {

    int id;
    String name;
    double price;
    String description;

    public Product() {
        System.out.println("Constructor çalıştı");
    }

    public Product(int id, String name, double price, String description) {
        // this() Product() adlı constructorıda çalıştırır.
        this();
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }
}
