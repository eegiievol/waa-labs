package lab3.lab3af.service;

import lab3.lab3af.domain.User;

import java.util.List;

public interface UserService {

    public List<User> getAll();
    public void save(User u);

    public List<String[]> getBasic();

    public void delete(String id);

    public void update(User u);

}
