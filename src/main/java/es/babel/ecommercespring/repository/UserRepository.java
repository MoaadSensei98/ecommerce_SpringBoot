package es.babel.ecommercespring.repository;

import es.babel.ecommercespring.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface LoginRepository extends CrudRepository<User, Long> {
    public Optional<User> findByUsername(String username);
}