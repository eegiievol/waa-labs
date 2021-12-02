package ORM.ormdemo.service;

import ORM.ormdemo.domain.Movies;
import ORM.ormdemo.domain.User;
import ORM.ormdemo.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    MovieRepo movieRepo;

    @Override
    public void save(Movies movies) {
        movieRepo.save(movies);
    }

    @Override
    public List<Movies> getAll() {

        List<Movies> movies = new ArrayList<>();

        var iterable = movieRepo.findAll();

        for (Movies m: iterable){
            movies.add(m);
        }
        return movies;
    }

    @Override
    public Movies movieByIden(String id) {
        return movieRepo.getMoviesById(id);
    }

    @Override
    public User getUserByMov(String id) {
        return movieRepo.getUserByMov(id);
    }
}
