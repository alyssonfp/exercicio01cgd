package com.pt.exercicio.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;


@Data
@Builder
public class Endereco extends RepresentationModel<Endereco> {

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
