package kodlamaio.day6_northwind.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.day6_northwind.business.abstracts.ProductService;
import kodlamaio.day6_northwind.core.utilities.results.DataResult;
import kodlamaio.day6_northwind.core.utilities.results.Result;
import kodlamaio.day6_northwind.core.utilities.results.SuccessDateResult;
import kodlamaio.day6_northwind.core.utilities.results.SuccessResult;
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
    public DataResult<List<Product>> getAll() {
        return new SuccessDateResult<List<Product>>(this.productDao.findAll(),"Ürün listelendi");
    }
    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Ürün eklendi");
    }
}
