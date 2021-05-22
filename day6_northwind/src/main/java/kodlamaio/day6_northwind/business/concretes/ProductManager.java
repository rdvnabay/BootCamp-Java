package kodlamaio.day6_northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.day6_northwind.business.abstracts.ProductService;
import kodlamaio.day6_northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.day6_northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{
    @Autowired
    private ProductDao productDao;
    public ProductManager(ProductDao productDao) {
        this.productDao=productDao;
    }
    @Override
    public List<Product> getAll() {
        return productDao.findAll();
    }
}
