package es.babel.ecommercespring.service;


import es.babel.ecommercespring.model.User;
import es.babel.ecommercespring.model.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}