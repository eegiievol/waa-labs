package lab3.lab3af.controller;


import lab3.lab3af.domain.User;
import lab3.lab3af.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/users/add")
    public void save(@RequestBody User u){
        userService.save(u);
    }

    @GetMapping("-----")
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/users/basic")
    public List<String[]> getAllNames(){
        return userService.getBasic();
    }


}
