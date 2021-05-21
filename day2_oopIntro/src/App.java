public class App {
    public static void main(String[] args) throws Exception {
        // Product
        Product product1 = new Product(1, "Lenovo Laptop", 4000, "Dizüstü Bilgisayar");

        Product product2 = new Product();
        product2.id = 2;
        product2.name = "Iphone 6";
        product2.description = "Akıllı Telefon";
        product2.price = 3300;

        Product product3 = new Product();
        product3.id = 3;
        product3.name = "Mouse";
        product3.description = "Kablosuz Mouse";
        product3.price = 110;

        Product[] products = { product1, product2, product3 };

        for (Product product : products) {
            System.out.println(product.name);
        }
        System.out.println(products.length);

        // Category
        Category category1 = new Category();
        category1.id = 1;
        category1.name = "Elektronik";

        Category category2 = new Category();
        category2.id = 2;
        category2.name = "Ev/Bahçe";

        // ProductManager
        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);
        productManager.addToCart(product2);
        productManager.addToCart(product3);
    }
}
