package br.alura.sham.solid.compositionliskov;

import java.util.Arrays;
import java.util.List;

public class ProcessadorDeInvestimento {

    public static void main(final String[] args) {

        for (ContaComum conta : contasDoBanco()) {
            conta.rende();

            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }
        
        System.out.println("Novo Saldo:");
        System.out.println(contaDeEstudanteCom(200).getSaldo());
    }

    private static List<ContaComum> contasDoBanco() {
        return Arrays.asList(umaContaCom(100), umaContaCom(150));
    }

    private static ContaDeEstudante contaDeEstudanteCom(final double amount) {
        ContaDeEstudante c = new ContaDeEstudante();
        c.deposita(amount);
        return c;
    }

    private static ContaComum umaContaCom(final double valor) {
        ContaComum c = new ContaComum();
        c.deposita(valor);
        return c;
    }	
}
