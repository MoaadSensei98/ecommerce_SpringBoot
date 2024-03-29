package es.babel.ecommercespring.controller;

import es.babel.ecommercespring.model.dto.UserRegistrationDto;
import es.babel.ecommercespring.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    private UserService userService;

    public RegistrationController(UserService userService) {
        super();
        this.userService = userService;
    }

    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }

    @GetMapping
    public String showRegistrationForm() {
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
        if(            registrationDto.getUsername().isEmpty() || registrationDto.getPassword().isEmpty()
        ){
            return "redirect:/registration?failed";

        }else {
            userService.save(registrationDto);
            return "redirect:/registration?success";

        }
    }
}
