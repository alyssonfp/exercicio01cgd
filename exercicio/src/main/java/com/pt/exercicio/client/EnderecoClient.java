package com.pt.exercicio.client;


import com.pt.exercicio.client.dto.EnderecoClientDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url="${domain.viacep}", name = "viacep")
public interface EnderecoClient {

    @GetMapping("{cep}/json")
    EnderecoClientDto buscaEnderecoPorCep(@PathVariable("cep") String cep);
}
