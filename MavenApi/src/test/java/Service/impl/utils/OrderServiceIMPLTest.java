package Service.impl.utils;

import Mapping.DTOS.OrderDTO;

import java.util.List;

class OrderServiceIMPLTest {
     OrderServiceIMPLTest orderService;
     ProductServiceIMPLTest productService;

     void setUp(){
         productService = new ProductServiceIMPLTest();
         orderService = new OrderServiceIMPLTest(productService);

     }
     void getOrderByProduct(){
         List<OrderDTO> epectedOrder = Uti
     }
}
