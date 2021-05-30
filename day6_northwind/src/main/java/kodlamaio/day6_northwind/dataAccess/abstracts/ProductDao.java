package kodlamaio.day6_northwind.dataAccess.abstracts;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.day6_northwind.entities.concretes.Product;
import kodlamaio.day6_northwind.entities.concretes.dtos.ProductWithCategoryDto;

public interface ProductDao extends JpaRepository<Product,Integer>{
Product getByProductName(String productName);	  
Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);
List<Product> getByProductNameOrCategory(String productName, int categoryId);
List<Product> getByCategoryIn(List<Integer> categories);
List<Product> getByProductNameContains(String productName);
List<Product> getByProductNameStartsWith(String productName);
@Query("From Product where productName=:productName and category.categoryId=:categoryId")
List<Product> getByNameAndCategory(String productName, int categoryId);
@Query("Select new kodlamaio.day6_northwind.entities.concretes.dtos.ProductWithCategoryDto(p.id,p.productName,c.categoryName) From Category c Inner Join c.products p")
List<ProductWithCategoryDto> getProductWithCategoryDetails();
}
