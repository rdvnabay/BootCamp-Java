package kodlamaio.day6_northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.day6_northwind.business.abstracts.UserService;
import kodlamaio.day6_northwind.core.dataAccess.UserDao;
import kodlamaio.day6_northwind.core.entities.User;
import kodlamaio.day6_northwind.core.utilities.results.DataResult;
import kodlamaio.day6_northwind.core.utilities.results.Result;
import kodlamaio.day6_northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.day6_northwind.core.utilities.results.SuccessResult;

@Service
public class UserManager implements UserService {

    @Autowired
    private UserDao userDao;
    public UserManager(UserDao userDao) {
        super();
        this.userDao = userDao;
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
       return  new SuccessResult();
    }

    @Override
    public DataResult<User> getByEmail(String email) {
       var data=this.userDao.findByEmail(email);
       return new SuccessDataResult<User>(data);
       
    }

}
