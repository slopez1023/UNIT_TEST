package Repositories.interfaces;

import Mapping.DTOS.CustomerDTO;

import java.util.List;

public interface CustomerInt {
    List<CustomerDTO> getAllCustomers();
}
