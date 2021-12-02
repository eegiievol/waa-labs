package ORM.ormdemo.service;

import ORM.ormdemo.domain.Movies;
import ORM.ormdemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface MovieService {

    void save(Movies movies);
    List<Movies> getAll();
    public Movies movieByIden(String id);
    public User getUserByMov(String id);

}
