package br.trimestral.senai.trimestral.repository;

import br.trimestral.senai.trimestral.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

    public List<Fornecedor> findByNome(String nome);

    public List<Fornecedor> findByEmail(String email);

    public List<Fornecedor> findByTelefoneLike(String telefone);

}
