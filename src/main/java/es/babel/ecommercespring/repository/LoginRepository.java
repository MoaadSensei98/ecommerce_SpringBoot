package es.babel.ecommercespring.repository;

import es.babel.ecommercespring.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface LoginRepository extends CrudRepository<Login, Long> {
    public Optional<Login> findByUsername(String username);
}