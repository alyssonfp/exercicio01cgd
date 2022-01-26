package com.pt.exercicio.client;


import com.pt.exercicio.client.dto.EnderecoClientDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url="${domain.viacep}", name = "viacep")
public interface EnderecoClient {

    @GetMapping("{cep}/json")
    EnderecoClientDto buscaEnderecoPorCep(@PathVariable("cep") String cep);

    @GetMapping("{uf}/{localidade}/{logradouro}/json")
    List<EnderecoClientDto> getListEndereco(@PathVariable String uf,
                                            @PathVariable String localidade,
                                            @PathVariable String logradouro);
}
