package org.example.model.service.promocao;

import org.example.ValidacaoException;
import org.example.model.Cargo;
import org.example.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario, boolean metaBatida) {
        Cargo cargoAtual = funcionario.getCargo();
        if(Cargo.GERENTE == cargoAtual) {
            throw new ValidacaoException("Gerentes não podem ser promovidos.");
        }

        if(metaBatida) {
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);

        } else {
            throw new ValidacaoException("Funcionário não bateu a meta! ");
        }

    }



}
