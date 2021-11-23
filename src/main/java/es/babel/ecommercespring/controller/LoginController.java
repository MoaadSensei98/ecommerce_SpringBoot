package es.babel.ecommercespring.controller;

import es.babel.ecommercespring.model.Login;
import es.babel.ecommercespring.model.Product;
import es.babel.ecommercespring.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Objects;


@Controller
public class LoginController {
    @GetMapping({"/","/login"})
    public String index() {
        return "index";
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

    @RequestMapping(value = {"/products"}, method = RequestMethod.POST)
    public String productList(HttpServletRequest request,HttpServletResponse response)
    {
        return "redirect:/products";
    }
}