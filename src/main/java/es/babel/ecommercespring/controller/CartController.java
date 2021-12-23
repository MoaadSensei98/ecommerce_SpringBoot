package es.babel.ecommercespring.controller;

import es.babel.ecommercespring.model.CartItem;
import es.babel.ecommercespring.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/cartList")
    public String getCartList(Model model) {
//       if(!cartService.getAllCartItems().isEmpty())
//        cartService.removeItems();

        List<CartItem> cartList = cartService.getAllCartItems();
        model.addAttribute("cartList", cartList);
        return "cartList";
    }


    @PostMapping("/cartList")
    public String addToCart(@RequestParam("id") Long id, @RequestParam("quantity") int quantity ){
        //modificar / quitar if todo al service
         if(cartService.getAllCartItems().isEmpty()   ){
            cartService.addCartItem(id,quantity);
        }else{
            cartService.addCartItemExisting(id,quantity);
        }
        cartService.removeItems();

        return "redirect:/products";
    }



}
