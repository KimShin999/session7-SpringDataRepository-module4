package Service.impl;

import Model.Customer;
import Repository.CustomerRepository;
import Service.CustomerService;
import exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;


public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) throws NotFoundException {
        Customer customer =  customerRepository.findOne(id);
        if (customer != null){
            return customer;
        }else throw new NotFoundException();
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.delete(id);
    }
}