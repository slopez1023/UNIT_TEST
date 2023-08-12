package Services.Interfaces;

import Mapping.DTOS.OrderDTO;
import Mapping.DTOS.ProductDTO;
import domain.models.Customer;

import java.util.List;
import java.util.Map;

public interface OrderSerINT {
    List<OrderDTO> getOrdersByProducts();
    List<OrderDTO> getLatestOrders();
    Double getSumProductsByDate();
    Double getAverageProductsByDate();
    Map<Customer, List<OrderDTO>> getOrderMapPerClient();
    List<ProductDTO> getProductByDateAndTier();
    Double getSumProductsByDateThread();
    void sleepThread(int millis);
    Double getAverageProductsByDateThread();
}
