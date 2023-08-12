package Repositories.interfaces;

import Mapping.DTOS.OrderDTO;

import java.util.List;

public interface OrderInt {
    List<OrderDTO> getAllOrders();
}
