package br.senai.controller;

import br.senai.model.Brinquedo;
import br.senai.service.BrinquedoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class BrinquedoController {

    @Autowired
    BrinquedoServiceImpl brinquedoService;

    @GetMapping("/brinquedo/")
    public List<Brinquedo> findAll()
        {return brinquedoService.findAll();}

    @GetMapping("/brinquedo/{id}")
    public Optional<Brinquedo> findById(@PathVariable Long id)
        {return brinquedoService.findById(id);}

    @PostMapping("/brinquedo/{id}")
    public Brinquedo create (@RequestBody Brinquedo produto)
        {return brinquedoService.create(produto);}

    @PutMapping("/brinquedo/{id}")
    public Brinquedo update (@RequestBody Brinquedo produto, @PathVariable Long id)
        {return brinquedoService.update(produto,id);}

    @DeleteMapping("/brinquedo/{id}")
    public void delete(@PathVariable Long id) {brinquedoService.deleteById(id);}


}
