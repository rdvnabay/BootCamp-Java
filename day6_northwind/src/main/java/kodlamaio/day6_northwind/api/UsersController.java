package kodlamaio.day6_northwind.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.day6_northwind.business.abstracts.UserService;
import kodlamaio.day6_northwind.core.entities.User;
import kodlamaio.day6_northwind.core.utilities.results.DataResult;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    
    @Autowired
    private UserService userService;
    public UsersController(UserService userService) {
        super();
        this.userService = userService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody User user){
        return ResponseEntity.ok(this.userService.add(user));
    }

    @GetMapping("/getbyemail")
    public ResponseEntity<DataResult<User>> getByEmail(String email){
        return ResponseEntity.ok(this.userService.getByEmail(email));
    }
}
