package ORM.ormdemo.service;

import ORM.ormdemo.domain.User;

import java.util.List;

public interface UserService {

    void addUser(User u);
    void delete(User u);
    void update(User u);
    List<User> getAll();

    void addMoviesByUser(User u);

    User getUserById(String id);

}
