package ORM.ormdemo.service;

import ORM.ormdemo.domain.Address;
import ORM.ormdemo.repository.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService{

    @Autowired
    AddressRepo addressRepo;


    @Override
    public void save(Address a) {
        addressRepo.save(a);
    }

    @Override
    public List<Address> getAll() {
        List<Address> addresses = new ArrayList<Address>();
        var iterable = addressRepo.findAll();

        for (Address a: iterable){
            addresses.add(a);
        }
        return addresses;
    }
}
