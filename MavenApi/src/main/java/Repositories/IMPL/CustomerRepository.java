package Repositories.IMPL;

import Mapping.DTOS.CustomerDTO;
import Repositories.interfaces.CustomerInt;
import domain.models.Customer;

import java.util.List;

public class CustomerRepository implements CustomerInt {

    List<Customer> customers;

    public CustomerRepository(){
        Customer customer1 = new Customer(1L,"Santi",1);
        Customer customer2 = new Customer(2L,"Maria",2);
        Customer customer3 = new Customer(3L,"Jaime",3);
        Customer customer4 = new Customer(4L,"Diana",4);

        customers = List.of(customer1, customer2, customer3, customer4);
    }
    public List<CustomerDTO> getAllCustomers(){
        return CustomerMapper.mapFrom(customers);
    }
}
