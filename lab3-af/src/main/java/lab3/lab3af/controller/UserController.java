package lab3.lab3af.controller;


import lab3.lab3af.domain.User;
import lab3.lab3af.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public void save(@RequestBody User u){
        userService.save(u);
    }

    @GetMapping("-----")
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/basic")
    public List<String[]> getAllNames(){
        return userService.getBasic();
    }

    @DeleteMapping("/del/{id}")
    public void delete(@PathVariable String id){
        userService.delete(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody User u){
        userService.update(u);
    }


}
