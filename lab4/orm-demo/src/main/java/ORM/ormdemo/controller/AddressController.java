package ORM.ormdemo.controller;

import ORM.ormdemo.domain.Address;
import ORM.ormdemo.domain.Course;
import ORM.ormdemo.repository.CourseRepository;
import ORM.ormdemo.service.AddressService;
import ORM.ormdemo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("addresses")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping
    public void save(@RequestBody Address address){
        addressService.save(address);
    }

    @GetMapping
    public List<Address> getAll(){
        return addressService.getAll();
    }
}
