package Service;

import Model.Customer;
import exception.NotFoundException;


public interface CustomerService {
    Iterable<Customer> findAll();

    Customer findById(Long id) throws NotFoundException;

    void save(Customer customer);

    void remove(Long id);
}
