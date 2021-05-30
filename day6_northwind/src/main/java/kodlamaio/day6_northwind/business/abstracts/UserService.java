package kodlamaio.day6_northwind.business.abstracts;

import kodlamaio.day6_northwind.core.entities.User;
import kodlamaio.day6_northwind.core.utilities.results.DataResult;
import kodlamaio.day6_northwind.core.utilities.results.Result;

public interface UserService {
    Result add(User user);
    DataResult<User> getByEmail(String email);
}
