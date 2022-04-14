package br.senai.repository;

import br.senai.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository <Funcionario, Long> {

    //métodos

    public Funcionario findByCpf(String cpf);
    public Funcionario findByNomeAndEmail(String nome, String email);
    public List<Funcionario> findByTelefoneLike(String telefone);




}
