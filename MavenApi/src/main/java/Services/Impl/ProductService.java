package Services.Impl;

import Mapping.DTOS.OrderDTO;
import Mapping.DTOS.ProductDTO;
import Repositories.IMPL.ProductRepository;
import Services.Interfaces.ProductSerINT;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductService implements ProductSerINT {
    List<ProductDTO> products;
    List<OrderDTO> orders;

    public ProductService(){
        ProductRepository productRepository = new ProductRepository();
        products = productRepository.getAllProducts();
    }
    public List<ProductDTO> getProductFromCategoryPrice(){
        return products.stream()
                .filter(e -> e.category().equalsIgnoreCase("Books"))
                .filter(e-> e.price()> 100)
                .toList();
    }
    public List<ProductDTO> getProductFromCategoryApplyDiscount(){
        return products.stream()
                .filter(e -> e.category().equalsIgnoreCase("Toys"))
                .map(d ->{
                    double DiscountP = d.price()* 0.10;
                    return new ProductDTO(d.id(),d.name(),d.category(),d.price()-DiscountP);
                })
                .toList();
    }
    public ProductDTO getCheapestProduct(){
        return products.stream()
                .filter(e -> e.category().equalsIgnoreCase("Books"))
                .min(Comparator.comparing(ProductDTO::price)).orElse(null);
    }
    public Map<String, Optional<ProductDTO>> getMostExpensiveProduct(){
        return products.stream()
                .collect(Collectors.groupingBy(ProductDTO::category,Collectors.
                        maxBy(Comparator.comparing(ProductDTO::price))));
    }
    public String getCheapestProductThread(){
        sleepThread(3000);
        return "Finished Threads " + getCheapestProduct();
    }

    @Override
    public List<ProductDTO> getProductFromCategoryApplyDiscountThread() {
        return null;
    }

    public void sleepThread(int millis){
        try{
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
