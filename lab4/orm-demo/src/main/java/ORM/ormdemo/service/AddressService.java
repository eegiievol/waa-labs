package ORM.ormdemo.service;

import ORM.ormdemo.domain.Address;

import java.util.List;

public interface AddressService {


    void save(Address a);
    List<Address> getAll();
}
