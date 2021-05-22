import java.util.List;

public class ProductManager implements ProductService {

	private ProductDao productDao;
	private LoggerService loggerService;
	public ProductManager(
			ProductDao productDao,
			LoggerService loggerService) {
		this.productDao=productDao;
		this.loggerService=loggerService;
	}
	@Override
	public void add(Product product) {
		productDao.add(product);
		loggerService.log("�r�n eklendi: "+product.getName());
		
	}

	@Override
	public List<Product> getAll() {
		//
		return null;
	}

}
