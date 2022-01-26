package com.pt.exercicio.service;

import com.pt.exercicio.dto.Endereco;

import java.util.List;

public interface EnderecoService {

    Endereco getEndereco(String cep);
    List<Endereco> getEndereco(String uf, String localidade, String logradouro);
}

