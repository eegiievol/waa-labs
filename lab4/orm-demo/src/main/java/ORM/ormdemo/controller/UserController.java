package ORM.ormdemo.controller;

import ORM.ormdemo.domain.User;
import ORM.ormdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getUsers(){
        return userService.getAll();
    }

    @PostMapping
    public void addUser(@RequestBody User u){
        userService.addUser(u);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id){
        return userService.getUserById(id);
    }

}
