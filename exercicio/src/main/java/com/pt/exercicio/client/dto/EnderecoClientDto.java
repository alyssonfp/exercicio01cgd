package com.pt.exercicio.client.dto;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class EnderecoClientDto {

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private Long ibge;
    private Long gia;
    private Long ddd;
    private Long siafi;

}
