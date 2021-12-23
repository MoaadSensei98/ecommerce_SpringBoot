//package es.babel.ecommercespring.service;
//
//import es.babel.ecommercespring.model.Login;
//import es.babel.ecommercespring.model.Product;
//import es.babel.ecommercespring.repository.LoginRepository;
//import es.babel.ecommercespring.repository.ProductRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.util.Arrays;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//class ProductServiceTest {
//    @Mock
//    private ProductRepository pRepo;
//
//    @InjectMocks
//    private ProductService productService;
//
//    private Product prod;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//
//        prod = new Product();
//
//        prod.setId(new Long(2));
//        prod.setProduct("manzana");
//
//    }
//    @Test
//    void getAllProducts() {
//        when(pRepo.findAll()).thenReturn(Arrays.asList(prod));
//        assertNotNull(productService.findAll());
//    }
//
//}