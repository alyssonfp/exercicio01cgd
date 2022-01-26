package com.pt.exercicio.validation;

import com.pt.exercicio.exception.runtime.CepException;
import com.pt.exercicio.exception.runtime.EnderecoException;
import org.apache.logging.log4j.util.Strings;
import org.springframework.util.StringUtils;

public class EnderecoValidation {

    public static void validate(String cep) {
        if (!StringUtils.hasLength(cep) || cep.length() != 8 || !cep.matches("[0-9]+")) {
            throw new CepException();
        }
    }

    public static void validate(String uf, String localidade, String logradouro) {
        if (Strings.isBlank(uf) || Strings.isBlank(localidade) || Strings.isBlank(logradouro)) {
            throw new EnderecoException();
        }
    }
}
