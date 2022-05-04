package br.trimestral.senai.trimestral.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class FornecedorController {

    @GetMapping("/fornecedor/list")
    public String findAll(){
        return "fornecedor/list";
    }
}
