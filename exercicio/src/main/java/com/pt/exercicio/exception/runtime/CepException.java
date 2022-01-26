package com.pt.exercicio.exception.runtime;

import com.pt.exercicio.exception.Status;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Cep invalido.")
@Status(value = 407, message = "O valor do CEP e invalido, favor inserir 8 caracteres.")
public class CepException extends CustomException {
}
