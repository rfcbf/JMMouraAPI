package br.com.moura.controller.v1;


import br.com.moura.dto.CadastroDTO;
import br.com.moura.mapper.CadastroMapper;
import br.com.moura.service.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/v1/cadastro")
public class CadastroController {

    @Autowired
    private CadastroService cadastroService;

    @Autowired
    private CadastroMapper cadastroMapper;

    @GetMapping()
    public ResponseEntity<List<CadastroDTO>> listarCadastro() {
        List<CadastroDTO> listaDTO = cadastroMapper.toDto(cadastroService.listarTodos());
        return ResponseEntity.ok(listaDTO);
    }

    @GetMapping("/{idCadastro}")
    public ResponseEntity<CadastroDTO> buscarCadastro(@PathVariable final Long idCadastro) {
        CadastroDTO dto = cadastroMapper.toDto(cadastroService.buscarCadastro(idCadastro));
        return ResponseEntity.ok(dto);
    }

    @PostMapping()
    public ResponseEntity<CadastroDTO> salvarCadastro(@RequestBody CadastroDTO cadastroDTO) {
        CadastroDTO dto = cadastroMapper.toDto(cadastroService.salvarCadastro(cadastroMapper.toEntity(cadastroDTO)));
        return ResponseEntity.ok(dto);
    }

    @PutMapping()
    public ResponseEntity<CadastroDTO> atualizarCadastro(@RequestBody CadastroDTO cadastroDTO) {
        CadastroDTO dto = cadastroMapper.toDto(cadastroService.atualizarCadastro(cadastroMapper.toEntity(cadastroDTO)));
        return ResponseEntity.ok(dto);
    }

    @DeleteMapping("/{idCadastro}")
    public ResponseEntity<Void> deletarCadastro(@PathVariable final Long idCadastro) {
        cadastroService.deletarCadastro(idCadastro);
        return ResponseEntity.ok().build();
    }
}
