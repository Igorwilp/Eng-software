package br.com.uniritter.projeto;

public class Controller {

    public void sacar(Conta conta, double valor) {
        System.out.println("Digite o valor que deseja sacar: ");
        if (valor <= conta.getSaldo()) {
            double novoSaldo = conta.getSaldo() - valor;
            conta.setSaldo(novoSaldo);
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void depositar(Conta conta, double valor) {
        double novoSaldo = conta.getSaldo() + valor;
        conta.setSaldo(novoSaldo);
        System.out.println("Depósito realizado com sucesso!");
    }

    public void transferir(Conta origem, double valor) {
        if (valor <= origem.getSaldo()) {
            double novoSaldoOrigem = origem.getSaldo() - valor;
            origem.setSaldo(novoSaldoOrigem);
            Conta destino = null;
            double novoSaldoDestino = destino.getSaldo() + valor;
            destino.setSaldo(novoSaldoDestino);
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void consultarSaldo(Conta conta, Object valorSaldo) {
        System.out.println("Saldo da conta " + conta.getNumeroConta() + ": R$ " + conta.getSaldo());
    }

}