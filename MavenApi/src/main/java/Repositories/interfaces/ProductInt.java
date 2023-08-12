package Repositories.interfaces;

import Mapping.DTOS.ProductDTO;

import java.util.List;

public interface ProductInt {
    List<ProductDTO> getAllProducts();
}
