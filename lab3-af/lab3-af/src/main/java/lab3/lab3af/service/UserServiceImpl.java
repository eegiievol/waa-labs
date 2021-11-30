package lab3.lab3af.service;

import lab3.lab3af.domain.User;
import lab3.lab3af.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //private List<User> users = new ArrayList<>();
    boolean flag=false;

    @Autowired
    UserRepo userRepo;

    private void createFake(){
        User u1 = new User("123", "John", "Brown", "test1@gmail.com", "pass123", 75);
        User u2 = new User("124", "Anthony", "Legend", "test2@gmail.com", "pass123", 85);
        userRepo.save(u1);
        userRepo.save(u2);
    }

    @Override
    public List<User> getAll() {
        if (flag==false){
            createFake();
            flag=true;
        }
        List<User> users = new ArrayList<>();

        var iterable = userRepo.findAll();
        for (User u: iterable){
            u.setWeight((int) (u.getWeight()/2.2));//to pound
            users.add(u);
        }
        return users;
    }

    @Override
    public void save(User u) {
        userRepo.save(u);
    }

    @Override
    public List<String[]> getBasic() {
        if (flag==false){
            createFake();
            flag=true;
        }

        List<String[]> basics = new ArrayList<String[]>();
        var iterable = userRepo.findAll();
        for (User u: iterable){
            String names[] = {u.getFname(), u.getLname()};
            basics.add(names);
        }
        return basics;
    }
}
