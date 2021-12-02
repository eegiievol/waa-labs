package ORM.ormdemo.repository;

import ORM.ormdemo.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<User, Long>{
//    public User findById(String id);
}
