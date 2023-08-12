package Repositories.IMPL;

import Mapping.DTOS.ProductDTO;
import Repositories.interfaces.ProductInt;
import domain.models.Product;

import java.util.List;

public class ProductRepository implements ProductInt {

    List<Product> products;

    public ProductRepository(){
        Product product1 = new Product(1L,"Bible","Books",15.9);
        Product product2 = new Product(2L,"Chupete","Baby",10.5);
        Product product3 = new Product(3L,"Barbie","Toys",23.7);
        Product product4 = new Product(4L,"Lord of the rings","Books",20.0);

        products = List.of(product1,product2,product3,product4);
    }
    public List<ProductDTO>getAllProducts(){
        return ProductMapper.mapFrom(products);
    }
}
