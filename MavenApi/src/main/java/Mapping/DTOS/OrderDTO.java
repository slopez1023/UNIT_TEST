package Mapping.DTOS;

import domain.models.Customer;
import domain.models.Product;

import java.time.LocalDate;
import java.util.List;

public record OrderDTO(Long id,
                       String status,
                       LocalDate orderdate,
                       LocalDate deliverydate,
                       List<Product> products,
                       Customer customer) {

}
