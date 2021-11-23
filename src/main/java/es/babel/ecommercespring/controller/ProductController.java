package es.babel.ecommercespring.controller;

import es.babel.ecommercespring.model.Login;
import es.babel.ecommercespring.model.Product;
import es.babel.ecommercespring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public String main(Model model, Login user) {
        String Username = user.getUsername();
        model.addAttribute("username", Username );
        List<Product> productList = productService.getAllProducts();
        model.addAttribute("productsItems", productList);
        return "products";
    }

//    @GetMapping("/products")
//    public String products() {
//        return "products";
//    }

}
