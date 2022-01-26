package com.pt.exercicio.service.impl;

import com.pt.exercicio.client.EnderecoClient;
import com.pt.exercicio.client.dto.EnderecoClientDto;
import com.pt.exercicio.converters.EnderecoClientDtoToEndereco;
import com.pt.exercicio.dto.Endereco;
import com.pt.exercicio.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EnderecoServiceImpl implements EnderecoService {
    private final EnderecoClient cepservice;
    private final ConversionService conversionService;
    private final EnderecoClientDtoToEndereco enderecoClientDtoToEndereco;

    @Override
    public Endereco getEndereco(String cep) {
        EnderecoClientDto enderecoClientDto = cepservice.buscaEnderecoPorCep(cep);
        Endereco endereco = conversionService.convert(enderecoClientDto, Endereco.class);
        return endereco;
    }

    @Override
    public List<Endereco> getEndereco(String uf, String localidade, String logradouro) {
        List<EnderecoClientDto> enderecoListClientDto = cepservice.getListEndereco(uf, localidade, logradouro);
        List<Endereco> enderecoList = enderecoClientDtoToEndereco.convertListEndereco(enderecoListClientDto);

        return enderecoList;
    }
}
