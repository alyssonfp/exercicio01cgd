package com.pt.exercicio.resource;



import com.pt.exercicio.dto.Endereco;
import com.pt.exercicio.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EnderecoResource {
    private final EnderecoService enderecoService;


    @GetMapping("cep/{cep}")
    public ResponseEntity<Endereco> getCep(@PathVariable String cep) {

        Endereco endereco = enderecoService.getEndereco(cep);

        return endereco != null ? ResponseEntity.ok().body(endereco) : ResponseEntity.notFound().build();
    }
}
