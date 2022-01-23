package com.pt.exercicio.entity;

import lombok.Data;


@Data
public class Endereco {

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
