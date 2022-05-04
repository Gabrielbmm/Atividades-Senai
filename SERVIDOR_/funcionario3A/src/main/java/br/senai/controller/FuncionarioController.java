package br.senai.controller;

import br.senai.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FuncionarioController {

    @Autowired
    FuncionarioService funcionarioService;

    @GetMapping("/funcionario/list")
    public String findAll(Model model){
        System.out.println(funcionarioService.findAll());
        model.addAttribute("funcionarios", funcionarioService.findAll());
        return "funcionario/list";

    }

    @GetMapping("/funcionario/add")
    public String add(Model model){
        model.addAttribute("funcionario", funcionarioService.findAll());
        return "funcionario/add";
    }
}
