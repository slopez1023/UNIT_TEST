package Services.Interfaces;

import Mapping.DTOS.ProductDTO;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface ProductSerINT {
    List<ProductDTO>getProductFromCategoryPrice();
    List<ProductDTO>getProductFromCategoryApplyDiscount();
    ProductDTO getCheapestProduct();
    Map<String, Optional<ProductDTO>> getMostExpensiveProduct();
    String getCheapestProductThread();
    List<ProductDTO>getProductFromCategoryApplyDiscountThread();
    void sleepThread(int millis);

}
