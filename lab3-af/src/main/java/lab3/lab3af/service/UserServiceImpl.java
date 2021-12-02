package lab3.lab3af.service;

import eye2web.modelmapper.ModelMapper;
import lab3.lab3af.domain.User;
import lab3.lab3af.dto.UserDto;
import lab3.lab3af.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import java.util.ArrayList;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<User> getAll() {
        return userRepo.getAll();
    }

    @Override
    public void save(User u) {
        userRepo.save(u);
    }

    @Override
    public List<String[]> getBasic() {
        return
            userRepo.getAll().stream()
                    .map(user -> modelMapper.map(user, UserDto.class))
                    .collect(Collectors.toList());

    }

    @Override
    public void delete(String id) {
        userRepo.delete(id);
    }

    @Override
    public void update(User u) {
        userRepo.update(u);
    }
}
