package kodlamaio.day6_northwind.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import kodlamaio.day6_northwind.business.abstracts.ProductService;
import kodlamaio.day6_northwind.core.utilities.results.DataResult;
import kodlamaio.day6_northwind.core.utilities.results.Result;
import kodlamaio.day6_northwind.core.utilities.results.SuccessDateResult;
import kodlamaio.day6_northwind.core.utilities.results.SuccessResult;
import kodlamaio.day6_northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.day6_northwind.entities.concretes.Product;
import kodlamaio.day6_northwind.entities.concretes.dtos.ProductWithCategoryDto;

@Service
public class ProductManager implements ProductService{

    @Autowired
	private ProductDao productDao;
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
    
    @Override
    public DataResult<List<Product>> getAll() {
        return new SuccessDateResult<List<Product>>
        (this.productDao.findAll(),"Data listelendi");		
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
		return new SuccessResult("Ürün eklendi");
    }

    @Override
    public DataResult<Product> getByProductName(String productName) {
        return new SuccessDateResult<Product>
        (this.productDao.getByProductName(productName),"Data listelendi");		
    }

    @Override
    public DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId) {
        return new SuccessDateResult<Product>
        (this.productDao.getByProductNameAndCategory_CategoryId(productName,categoryId),"Data listelendi");		
    }

    @Override
    public DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId) {
        return new SuccessDateResult<List<Product>>
        (this.productDao.getByProductNameOrCategory(productName,categoryId),"Data listelendi");	
    }

    @Override
    public DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories) {
        return new SuccessDateResult<List<Product>>
        (this.productDao.getByCategoryIn(categories),"Data listelendi");	
    }

    @Override
    public DataResult<List<Product>> getByProductNameContains(String productName) {
        return new SuccessDateResult<List<Product>>
        (this.productDao.getByProductNameContains(productName),"Data listelendi");	
    }

    @Override
    public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
        return new SuccessDateResult<List<Product>>
        (this.productDao.getByProductNameStartsWith(productName),"Data listelendi");	
    }

    @Override
    public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
        return new SuccessDateResult<List<Product>>
        (this.productDao.getByProductNameOrCategory(productName,categoryId),"Data listelendi");	
    }
    @Override
    public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
        Pageable  pageable=PageRequest.of(pageNo-1, pageSize);
        return new SuccessDateResult<List<Product>>(this.productDao.findAll(pageable).getContent());
    }
    @Override
    public DataResult<List<Product>> getAllSorted() {
        Sort sort=Sort.by(Direction.DESC,"productName");
        return new SuccessDateResult<List<Product>>(this.productDao.findAll(sort));
    }

    @Override
    public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails() {
      return new SuccessDateResult<List<ProductWithCategoryDto>>(
          this.productDao.getProductWithCategoryDetails(),"Data listelendi" );
    }
    
}
