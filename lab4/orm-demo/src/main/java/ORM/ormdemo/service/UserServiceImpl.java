package ORM.ormdemo.service;

import ORM.ormdemo.domain.User;
import ORM.ormdemo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public void addUser(User u) {
        userRepo.save(u);
    }

    @Override
    public void delete(User u) {

    }

    @Override
    public void update(User u) {

    }

    @Override
    public List<User> getAll() {

        List<User> users = new ArrayList<>();
        var iterable = userRepo.findAll();

        for (User u: iterable){
            users.add(u);
        }
        return users;
    }

    @Override
    public void addMoviesByUser(User u) {

    }

    @Override
    public User getUserById(String id) {
        //return userRepo.findById(id);
        return null;
    }
}
