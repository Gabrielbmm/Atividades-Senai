package br.senai.service;

import br.senai.model.Brinquedo;

import java.util.List;
import java.util.Optional;

public interface BrinquedoService {

    public List<Brinquedo> findAll();
    public Optional<Brinquedo> findById(Long id);
    public Brinquedo create(Brinquedo newBrinquedo);
    public Brinquedo update(Brinquedo updatedBrinquedo, Long id);
    public void deleteById(Long id);
}
