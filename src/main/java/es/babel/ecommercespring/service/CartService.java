package es.babel.ecommercespring.service;

import es.babel.ecommercespring.model.CartItem;
import es.babel.ecommercespring.model.Product;
import es.babel.ecommercespring.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class CartService {
    @Autowired
    private CartService cartService;
    @Autowired
    private CartItemRepository cartItemRepository;
    @Autowired
    private ProductService productService;

    public List<CartItem> getAllCartItems() {
        return cartItemRepository.findAll();
    }

    public void removeItems() {
//        CartItem cartItem = null;
        List<CartItem> cartList = cartService.getAllCartItems();
        for (CartItem item : cartList) {
            if (item.getQuantity() == 0) {
                //     System.out.println("NOMBRE DEL PRODUCTO SIN CANTIDAD "+ item.getId()+ " " + item.getProduct().getProductname());
                deleteProduct(item.getId());

            }
        }
    }

    public String deleteProduct(Long id) {
        if (cartItemRepository.findById(id).isPresent()) {
            System.out.println("ID " + id);
            cartItemRepository.getById(id);
            return "Customer eliminado correctamente.";
        }
        return "Error! El customer no existe";
    }

    public CartItem addCartItem(Long id, int quantity) {
        CartItem cartItem = new CartItem();
        cartItem.setQuantity(quantity);
        cartItem.setProduct(productService.getProductById(id));
        return cartItemRepository.save(cartItem);
    }

    public CartItem addCartItemExisting(Long id, int quantity) {
        List<CartItem> cartList = cartService.getAllCartItems();
        //comprueba si el elemento del carro tiene id

        Optional<CartItem> existingPoduct = cartList.stream().filter(x -> x.getId().equals(id)).findFirst();
        if (existingPoduct.isPresent()) {
            System.out.println(existingPoduct.get().getQuantity() + " LA CANTIDAD DE ANTES");
            System.out.println(quantity + " CANTIDAD AÑADIDA");
            existingPoduct.get().setQuantity( existingPoduct.get().getQuantity() + quantity);

            return cartItemRepository.saveAndFlush(existingPoduct.get());


        } else {
            addCartItem(id, quantity);
        }
        return this.addCartItemExisting(id, quantity);

    }
}
