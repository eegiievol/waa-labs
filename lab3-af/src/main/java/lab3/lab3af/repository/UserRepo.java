package lab3.lab3af.repository;

import lab3.lab3af.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class UserRepo {

    private List<User> users = new ArrayList<>();
    boolean flag=false;

    private void createFake(){
        User u1 = new User("123", "John", "Brown", "test1@gmail.com", "pass123", 75);
        User u2 = new User("124", "Anthony", "Legend", "test2@gmail.com", "pass123", 85);
        users.add(u1);
        users.add(u2);
    }


    public List<User> getAll() {
        if (flag==false){
            createFake();
            flag=true;
        }
        List<User> userList = new ArrayList<>();

        for (User u: users ){
            u.setWeight((int) (u.getWeight()/2.2));//to pound
            userList.add(u);
        }
        return userList;
    }


    public void save(User u) {
        users.add(u);
    }

    public void delete(String id) {
        for (User u: users){
            if (u.getId().equals(id)){
                users.remove(u);
            }
        }
    }

    public void update(User u){
        for(User user: users){
            if (user.getId().equals(u.getId())){
                users.remove(user);
                users.add(u);
            }
        }
    }


}

//public interface UserRepo extends CrudRepository<User, Long>{}