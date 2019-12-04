package br.com.moura.repository;

import br.com.moura.domain.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Long>, QueryByExampleExecutor<Cadastro> {

}
