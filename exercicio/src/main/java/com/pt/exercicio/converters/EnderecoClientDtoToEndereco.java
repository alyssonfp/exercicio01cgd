package com.pt.exercicio.converters;

import com.pt.exercicio.client.dto.EnderecoClientDto;
import com.pt.exercicio.dto.Endereco;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class EnderecoClientDtoToEndereco implements Converter <EnderecoClientDto, Endereco> {

    @Override
    public Endereco convert(EnderecoClientDto source) {
        return Endereco.builder()
                .bairro(source.getBairro())
                .cep(source.getCep())
                .complemento(source.getComplemento())
                .ddd(source.getDdd())
                .gia(source.getGia())
                .ibge(source.getIbge())
                .localidade(source.getLocalidade())
                .logradouro(source.getLogradouro())
                .siafi(source.getSiafi())
                .uf(source.getUf())
                .build();
    }
}
