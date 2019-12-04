package br.com.moura.mapper;

import br.com.moura.domain.Cadastro;
import br.com.moura.dto.CadastroDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-04T12:47:58-0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_212 (AdoptOpenJDK)"
)
@Component
public class CadastroMapperImpl implements CadastroMapper {

    @Override
    public CadastroDTO toDto(Cadastro entity) {
        if ( entity == null ) {
            return null;
        }

        CadastroDTO cadastroDTO = new CadastroDTO();

        if ( entity.getId() != null ) {
            cadastroDTO.setId( String.valueOf( entity.getId() ) );
        }
        cadastroDTO.setNome( entity.getNome() );
        cadastroDTO.setEndereco( entity.getEndereco() );
        cadastroDTO.setCidade( entity.getCidade() );
        cadastroDTO.setBairro( entity.getBairro() );
        cadastroDTO.setEstado( entity.getEstado() );
        cadastroDTO.setCep( entity.getCep() );
        cadastroDTO.setCelular( entity.getCelular() );

        return cadastroDTO;
    }

    @Override
    public Cadastro toEntity(CadastroDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Cadastro cadastro = new Cadastro();

        if ( dto.getId() != null ) {
            cadastro.setId( Long.parseLong( dto.getId() ) );
        }
        cadastro.setNome( dto.getNome() );
        cadastro.setEndereco( dto.getEndereco() );
        cadastro.setCidade( dto.getCidade() );
        cadastro.setBairro( dto.getBairro() );
        cadastro.setCep( dto.getCep() );
        cadastro.setCelular( dto.getCelular() );
        cadastro.setEstado( dto.getEstado() );

        return cadastro;
    }

    @Override
    public List<CadastroDTO> toDto(List<Cadastro> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CadastroDTO> list = new ArrayList<CadastroDTO>( entities.size() );
        for ( Cadastro cadastro : entities ) {
            list.add( toDto( cadastro ) );
        }

        return list;
    }

    @Override
    public List<Cadastro> toEntity(List<CadastroDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Cadastro> list = new ArrayList<Cadastro>( dtos.size() );
        for ( CadastroDTO cadastroDTO : dtos ) {
            list.add( toEntity( cadastroDTO ) );
        }

        return list;
    }
}
