package es.babel.ecommercespring.service;

import es.babel.ecommercespring.model.Product;
import es.babel.ecommercespring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService{
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {

        return productRepository.findById(id).get();
    }
    public List<Product> findAll() {
        return productRepository.findAll();
    }


    public List<Product> findAll(Sort sort) {
        return productRepository.findAll(sort);
    }

}
