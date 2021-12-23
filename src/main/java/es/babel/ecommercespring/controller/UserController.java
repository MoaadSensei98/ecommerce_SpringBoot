package es.babel.ecommercespring.controller;

import es.babel.ecommercespring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class UserController {
    @GetMapping({"/","/login"})
    public String login() {
        return "login";
    }

    @GetMapping("/menu")
    public String menu() {
        return "menu";
    }

    @GetMapping("/user")
    public String user() {
        return "user";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

    @GetMapping("/403")
    public String error403() {
        return "403";
    }

    @RequestMapping(value = {"/products"}, method = RequestMethod.POST)
    public String productList() {
        return "redirect:/products";
    }




}