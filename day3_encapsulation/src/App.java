public class App {
    public static void main(String[] args) throws Exception {
        //Product
		Product product1=new Product(1,"Lenovo V15",13000,"16 Gb Ram",10);
		Product product2=new Product();
		
		//set
		product2.setId(2);
		product2.setName("Iphone S6");
		product2.setDescription("16 MP");
		product2.setPrice(4000);
		product2.setDiscount(20);
		
		//get
		System.out.println(product1.getName()+" İndirim sonrası fiyatı: "+product1.getPriceAfterDiscount());
		System.out.println(product2.getName()+" İndirim sonrası fiyatı: "+product2.getPriceAfterDiscount());
		ProductManager productManager=new ProductManager();
		productManager.addToCart(product1);

		System.out.println("-----------------------------------------------------------------------------");
		//Category
		Category category1=new Category();
		category1.setId(1);
		category1.setName("İçecek");
		
		Category category2=new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
    }
}
