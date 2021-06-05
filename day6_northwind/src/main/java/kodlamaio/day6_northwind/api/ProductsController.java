package kodlamaio.day6_northwind.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.day6_northwind.entities.concretes.Product;
import kodlamaio.day6_northwind.entities.concretes.dtos.ProductWithCategoryDto;
import kodlamaio.day6_northwind.business.abstracts.ProductService;
import kodlamaio.day6_northwind.core.utilities.results.DataResult;
import kodlamaio.day6_northwind.core.utilities.results.Result;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductsController {

   @Autowired
   private ProductService productService;

   public ProductsController(ProductService productService) {
      this.productService = productService;
   }

   @GetMapping("/getall")
   public DataResult<List<Product>> getAll() {
      return this.productService.getAll();
   }

   @PostMapping("/add")
   public Result add(@RequestBody Product product) {
      return this.productService.add(product);
   }

   @GetMapping("/getProductName")
   public DataResult<Product> getByProductName(@RequestParam String productName) {
      return this.productService.getByProductName(productName);
   }

   @GetMapping("/getByProductNameAndCategoryId")
   public DataResult<Product> getByProductNameAndCategoryId(@RequestParam int categoryId,
         @RequestParam String productName) {
      return this.productService.getByProductNameAndCategoryId(productName, categoryId);
   }

   @GetMapping("/getByProductNameContains")
   public DataResult<List<Product>> getByProductNameContains(String productName) {
      return this.productService.getByProductNameContains(productName);
   }

   @GetMapping("/getAllByPage")
   public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
      return this.productService.getAll(pageNo, pageSize);
   }

   @GetMapping("/getAllSorted")
   public DataResult<List<Product>> getAllSorted() {
      return this.productService.getAllSorted();
   }

   @GetMapping("/getProductWithCategoryDetails")
   public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails() {
      return this.productService.getProductWithCategoryDetails();
    }
}
