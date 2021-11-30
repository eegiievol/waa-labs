package lab3.lab3af.repository;

import lab3.lab3af.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
/*
public class UserRepoImpl implements UserRepo{

    List<User> users = new ArrayList<User>();

    public List<User> getUsers(){
        if (users.size() == 0){
            User u1 = new User("134", "Green", "Browny", "test1@gmail.com", "pass123", 45);
            User u2 = new User("134", "Boldy", "Cooker", "test2@gmail.com", "pass123", 35);
            users.add(u1);
            users.add(u2);
        }
        return users;
    }

    public void save(User u){
        users.add(u);
    }




}
*/
public interface UserRepo extends CrudRepository<User, Long>{}