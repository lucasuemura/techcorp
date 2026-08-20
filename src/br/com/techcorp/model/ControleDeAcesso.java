package br.com.techcorp.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//-------------------------------------------------------------------------------------//

public class ControleDeAcesso {
    
    private List<Funcionario> historicoCatraca;
    private Set<Funcionario> autorizadosSalaSegura;

    public ControleDeAcesso() {
        this.historicoCatraca = new ArrayList<>();
        this.autorizadosSalaSegura = new HashSet<>();
    }

    public void registrarPassagem(Funcionario f) {
        historicoCatraca.add(f);
        System.out.println("Catraca: Passagem registrada para " + f.getNome());
    }

    public void concederAcessoSala(Funcionario f) {

        if (autorizadosSalaSegura.add(f)) {
            System.out.println("Acesso liberado para a Sala Segura: " + f.getNome());
        } else {
            System.out.println("Aviso: Matrícula já registrada na sala. Acesso não permitido. (" + f.getNome() + ")");
        }
    }
}