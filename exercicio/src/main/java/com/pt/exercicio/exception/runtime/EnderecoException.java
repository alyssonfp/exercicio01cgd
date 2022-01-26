package com.pt.exercicio.exception.runtime;

import com.pt.exercicio.exception.Status;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Endereco invalido.")
@Status(value = 408, message = "o valor do endereco e invalido")
public class EnderecoException extends CustomException {
}
