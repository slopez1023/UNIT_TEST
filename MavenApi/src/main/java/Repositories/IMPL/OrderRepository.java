package Repositories.IMPL;

import Mapping.DTOS.OrderDTO;
import Repositories.interfaces.OrderInt;
import domain.models.Customer;
import domain.models.Order;
import domain.models.Product;

import java.time.LocalDate;
import java.util.List;

public class OrderRepository implements OrderInt {

    private List<Order> orders;
    private List<Product> products;
    private List<Customer> customers;

    public OrderRepository(){
        CustomerRepository customerRepository = new CustomerRepository();
        ProductRepository productRepository = new ProductRepository();
        customers = CustomerMapper.mapFromDto(customerRepository.getAllCustomers());
        products = ProductMapper.mapFromDto(productRepository.getAllProducts());

        Order order1 = new Order(1L,"Active", LocalDate.of(2021,10,25),LocalDate.now(),products.subList(1,2),customers.get(0));
        Order order2 = new Order(2L,"Active", LocalDate.of(2022,2,2),LocalDate.now(),products.subList(0,2),customers.get(1));
        Order order3 = new Order(3L,"Active", LocalDate.of(2022,3,28),LocalDate.now(),products.subList(2,3),customers.get(2));
        Order order4 = new Order(4L,"Active", LocalDate.of(2023,12,28),LocalDate.now(),products.subList(1,3),customers.get(3));

        orders = List.of(order1,order2,order3,order4);

    }
    public List<OrderDTO> getAllProducts(){
        return OrderMapper.mapFrom(orders);
    }


}
