package ORM.ormdemo.repository;

import ORM.ormdemo.domain.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends CrudRepository<Address,Long> {
}
