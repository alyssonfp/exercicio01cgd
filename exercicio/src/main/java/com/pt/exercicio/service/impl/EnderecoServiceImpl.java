package com.pt.exercicio.service.impl;

import com.pt.exercicio.client.EnderecoClient;
import com.pt.exercicio.client.dto.EnderecoClientDto;
import com.pt.exercicio.dto.Endereco;
import com.pt.exercicio.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnderecoServiceImpl implements EnderecoService {
    private final EnderecoClient cepservice;
    private final ConversionService conversionService;

    @Override
    public Endereco getEndereco(String cep) {
        EnderecoClientDto enderecoClientDto = cepservice.buscaEnderecoPorCep(cep);

        Endereco endereco = conversionService.convert(enderecoClientDto, Endereco.class);
        return endereco;
    }
}
