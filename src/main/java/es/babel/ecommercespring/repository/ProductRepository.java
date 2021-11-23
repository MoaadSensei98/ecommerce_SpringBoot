package es.babel.ecommercespring.repository;

import es.babel.ecommercespring.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
 }
