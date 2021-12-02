package ORM.ormdemo.controller;

import ORM.ormdemo.domain.Movies;
import ORM.ormdemo.domain.User;
import ORM.ormdemo.repository.MovieRepo;
import ORM.ormdemo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping
    public List<Movies> getAll(){
        return movieService.getAll();
    }

    @PostMapping
    public void addMovie(@RequestBody Movies movies){
        movieService.save(movies);
    }

    @GetMapping("/{id}")
    public Movies getMovie(@PathVariable String id){
        return movieService.movieByIden(id);
    }

    @GetMapping("/user")
    public User getUserFrMov(@RequestParam("id") String id){
        return movieService.getUserByMov(id);
    }

}
