public class App {
    public static void main(String[] args) throws Exception {
        ProductService productManager=new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
        Product product1=new Product(1,1,"Elma",10,100);
        productManager.add(product1);
    
    }
}
