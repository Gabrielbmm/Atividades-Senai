package br.senai.service;

import br.senai.model.Brinquedo;
import br.senai.model.Usuario;
import br.senai.repository.BrinquedoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class BrinquedoServiceImpl implements BrinquedoService{

    @Autowired
    BrinquedoRepository brinquedoRepository;

    @Override
    public List<Brinquedo> findAll() {
        return brinquedoRepository.findAll();
    }

    @Override
    public Optional<Brinquedo> findById(Long id) {
        return brinquedoRepository.findById(id);
    }

    @Override
    public Brinquedo create(Brinquedo newBrinquedo) { return brinquedoRepository.save(newBrinquedo); }

    @Override
    public Brinquedo update(Brinquedo updateBrinquedo, Long id) {
        Optional <Brinquedo> u = brinquedoRepository.findById(id);
        if (u.isEmpty()){
            return null;
        }
        u.get().setNome(updateBrinquedo.getNome());
        u.get().setCategoria(updateBrinquedo.getCategoria());
        u.get().setApelido(updateBrinquedo.getApelido());
        u.get().setCor(updateBrinquedo.getCor());


        return brinquedoRepository.save(u.get());
    }

    @Override
    public void deleteById(Long id) {
        brinquedoRepository.deleteById(id);
    }
}
