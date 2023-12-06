package com.example.rsocial2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedeSocialController {
    @GetMapping
    public String index() {
        return login();
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/postagens")
    public String postagens() {
        return "postagens";
    }

    @GetMapping("/nova_postagem")
    public String novaPostagem() {
        return "nova_postagem";
    }
}
