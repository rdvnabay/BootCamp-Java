package kodlamaio.day6_northwind.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.day6_northwind.core.entities.User;

public interface UserDao extends JpaRepository<User,Integer> {
    User findByEmail(String email);
}
