package es.babel.ecommercespring.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String product;
    private String image;

    public Product() {
    }

    public Product(Long id, String product) {
        this.id = id;
        this.product = product;
    }

}
