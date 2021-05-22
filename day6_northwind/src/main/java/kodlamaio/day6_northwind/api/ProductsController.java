package kodlamaio.day6_northwind.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.day6_northwind.entities.concretes.Product;
import kodlamaio.day6_northwind.business.abstracts.ProductService;
import kodlamaio.day6_northwind.core.utilities.results.DataResult;
import kodlamaio.day6_northwind.core.utilities.results.Result;


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
    public DataResult<List<Product>> getAll() {
       return this.productService.getAll();
    }

   @Override
   @PostMapping("/add")
   public Result add(@RequestBody Product product) {
     return this.productService.add(product);
   }   
}
