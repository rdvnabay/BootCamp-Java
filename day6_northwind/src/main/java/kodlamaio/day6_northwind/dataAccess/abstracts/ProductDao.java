package kodlamaio.day6_northwind.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.day6_northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{

}
