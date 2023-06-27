package org.example.model.service;

import org.example.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {
     void validar(Funcionario funcionario, BigDecimal aumento);
}
