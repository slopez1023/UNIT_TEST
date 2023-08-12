package Mapping.Mappers;

import Mapping.DTOS.CustomerDTO;
import domain.models.Customer;

import java.util.List;

public class CustomerMapper {

    public static CustomerDTO mapFrom(Customer source){
        return new CustomerDTO(source.getId(),
                source.getName(),
                source.getTier());
    }

    public static Customer mapFrom(CustomerDTO source){
        return new Customer(source.id(),
                source.name(),
                source.tier());
    }
    public static List<CustomerDTO>mapFrom (List<Customer>source){
        return source.parallelStream().map(e-> mapFrom(e)).toList();
    }
    public static List<Customer> mapFromDto (List<CustomerDTO> source){
        return source.parallelStream().map(e-> mapFrom(e)).toList();
    }
}
