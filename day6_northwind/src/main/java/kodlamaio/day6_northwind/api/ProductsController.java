package kodlamaio.day6_northwind.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.day6_northwind.entities.concretes.Product;
import kodlamaio.day6_northwind.business.abstracts.ProductService;


@RestController
@RequestMapping("/api/products")
public class ProductsController implements ProductService {

    @Autowired
    private ProductService productService;
    public ProductsController(ProductService productService) {
       this.productService=productService;
    }
    @Override
    @GetMapping("/getall")
    public List<Product> getAll() {
       return productService.getAll();
    }
    
}
