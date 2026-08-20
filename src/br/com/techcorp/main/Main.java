package br.com.techcorp.main;

import br.com.techcorp.model.ControleDeAcesso;
import br.com.techcorp.model.Funcionario;

//-------------------------------------------------------------------------------------/

public class Main {
    public static void main(String[] args){

        ControleDeAcesso controle = new ControleDeAcesso();
        Funcionario f1 = new Funcionario("T-001", "Alice", "Analista de Redes");
        Funcionario f2 = new Funcionario("T-002", "Marcos", "Repositor do Atacadão");
        System.out.println("--- Validando Histórico de Entradas (A Catraca) ---");
      
        controle.registrarPassagem(f1);
        controle.registrarPassagem(f2);

        System.out.println("\n--- Validando Acesso ao Servidor (A Sala Segura) ---");

        controle.concederAcessoSala(f1);
        controle.concederAcessoSala(f2);
    }
}
