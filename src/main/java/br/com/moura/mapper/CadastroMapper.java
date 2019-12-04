package br.com.moura.mapper;

import br.com.moura.domain.Cadastro;
import br.com.moura.dto.CadastroDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {LocalDateToStringMapper.class, LocalDateTimeToStringMapper.class})
public interface CadastroMapper extends BaseMapper<Cadastro, CadastroDTO> {

}
