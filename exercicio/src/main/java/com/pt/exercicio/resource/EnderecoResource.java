package com.pt.exercicio.resource;


import com.pt.exercicio.dto.Endereco;
import com.pt.exercicio.service.EnderecoService;
import com.pt.exercicio.validation.EnderecoValidation;
import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EnderecoResource {
    private final EnderecoService enderecoService;


    @GetMapping("/cep/{cep}")
    public ResponseEntity<Endereco> getCep(@PathVariable("cep") String cep) {
        EnderecoValidation.validate(cep);
        Endereco endereco = enderecoService.getEndereco(cep);

       endereco.add(WebMvcLinkBuilder.linkTo(Endereco.class).slash(endereco.getCep()).withSelfRel());
        return endereco != null ? ResponseEntity.ok().body(endereco) : ResponseEntity.notFound().build();
    }
    @GetMapping("/{uf}/{localidade}/{logradouro}")
    public ResponseEntity <List<Endereco>> getEnderecoList(@PathVariable String uf,
                                                           @PathVariable String localidade,
                                                           @PathVariable String logradouro){
        EnderecoValidation.validate(uf, localidade, logradouro);
        List<Endereco> endereco = enderecoService.getEndereco(uf, localidade, logradouro);
        return endereco != null ? ResponseEntity.ok().body(endereco) : ResponseEntity.notFound().build();



    }



}
