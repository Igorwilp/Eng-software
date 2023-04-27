package br.com.uniritter.projeto;

public class Conta {
    private int agencia;
    private String numeroConta;
    private double saldo;
    private String cliente;

    public Conta(int agencia, String numeroConta, double saldo, String cliente) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = String.valueOf(cliente);
    }
}