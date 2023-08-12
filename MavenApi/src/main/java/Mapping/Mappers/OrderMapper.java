package Mapping.Mappers;

import Mapping.DTOS.OrderDTO;
import domain.models.Order;

import java.util.List;

public class OrderMapper {
    public static OrderDTO mapFrom (Order source){
        return new OrderDTO(source.getId(),
                source.getStatus(),
                source.getOrderdate(),
                source.getDeliverydate(),
                source.getProducts(),
                source.getCustomer());

    }
    public static Order mapFrom(OrderDTO source){
        return new Order(source.id(),
                source.status(),
                source.orderdate(),
                source.deliverydate(),
                source.products(),
                source.customer());
    }
    public static List<OrderDTO> mapFrom(List<Order>source) {
        return source.parallelStream().map(e->mapFrom(e)).toList();
    }
}
