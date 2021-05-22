package kodlamaio.day6_northwind.business.abstracts;

import java.util.List;
import kodlamaio.day6_northwind.core.utilities.results.DataResult;
import kodlamaio.day6_northwind.core.utilities.results.Result;
import kodlamaio.day6_northwind.entities.concretes.Product;

public interface ProductService {
    DataResult<List<Product>>getAll();
    Result add(Product product);
}
