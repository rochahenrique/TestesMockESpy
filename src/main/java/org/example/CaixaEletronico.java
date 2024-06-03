package org.example;

public class CaixaEletronico {
    private Banco banco;

    public double calcularSaldoTotal(){
        double saldoCorrente = banco.getSaldoContaCorrente();
        double saldoPoupanca = banco.getSaldoContaPoupanca();

        return saldoCorrente + saldoPoupanca;
    }

    public CaixaEletronico(Banco banco){
        this.banco = banco;
    }
}
