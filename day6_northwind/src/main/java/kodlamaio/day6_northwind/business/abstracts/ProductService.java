package kodlamaio.day6_northwind.business.abstracts;
import java.util.List;
import kodlamaio.day6_northwind.entities.concretes.Product;

public interface ProductService {
    List<Product>getAll();
}
