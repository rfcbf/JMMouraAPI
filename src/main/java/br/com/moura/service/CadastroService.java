package br.com.moura.service;

import br.com.moura.domain.Cadastro;
import br.com.moura.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastroService {

    private final CadastroRepository cadastroRepository;

    @Autowired
    public CadastroService(CadastroRepository cadastroRepository) {
        this.cadastroRepository = cadastroRepository;
    }

    public List<Cadastro> listarTodos() {
        return cadastroRepository.findAll();
    }

    public Cadastro salvarCadastro(Cadastro cadastro) {
        return cadastroRepository.save(cadastro);
    }

    public Cadastro atualizarCadastro(Cadastro cadastro) {
        return cadastroRepository.save(cadastro);
    }

    public Cadastro buscarCadastro(Long idCadastro) {
        return cadastroRepository.findById(idCadastro).orElse(null);
    }

    public void deletarCadastro(Long idCadastro) {
        cadastroRepository.deleteById(idCadastro);
    }
}