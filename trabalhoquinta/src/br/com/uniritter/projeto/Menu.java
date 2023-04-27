package br.com.uniritter.projeto;

import br.com.uniritter.projeto.Controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    // Dados de usuários cadastrados
    private static List<String> usuarios = new ArrayList<>();
    private static List<String> senhas = new ArrayList<>();
    public static Controller controller = new Controller();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Login");
            System.out.println("2 - Cadastro");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Opção de login selecionada.");
                    boolean loginEfetuado = fazerLogin(scanner);
                    if (loginEfetuado) {
                        System.out.println("Login efetuado com sucesso!");
                        // Implementação do menu de opções para usuário logado
                    } else {
                        System.out.println("Falha ao efetuar login. Tente novamente.");
                    }
                    break;

                case 2:
                    System.out.println("Opção de cadastro selecionada.");
                    boolean cadastroEfetuado = fazerCadastro(scanner);
                    if (cadastroEfetuado) {
                        System.out.println("Cadastro efetuado com sucesso!");
                    } else {
                        System.out.println("Falha ao efetuar cadastro. Tente novamente.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println();

        } while (opcao != 0);

        scanner.close();
    }

    private static boolean fazerLogin(Scanner scanner) {
        System.out.println("Insira seu nome de usuário:");
        String usuario = scanner.next();
        System.out.println("Insira sua senha:");
        String senha = scanner.next();

        // Verifica se o usuário e a senha estão cadastrados
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).equals(usuario) && senhas.get(i).equals(senha)) {
                menuOperacoes(scanner);
            }
        }
        return false;
    }

    private static boolean fazerCadastro(Scanner scanner) {
        System.out.println("Insira seu nome de usuário:");
        String usuario = scanner.next();
        System.out.println("Insira sua senha:");
        String senha = scanner.next();

        // Verifica se o usuário já está cadastrado
        if (usuarios.contains(usuario)) {
            System.out.println("Usuário já cadastrado!");
            return false;
        }

        // Adiciona o usuário e a senha às listas de cadastro
        usuarios.add(usuario);
        senhas.add(senha);

        return true;
    }

    public static void menuOperacoes(Scanner scanner) {
        int opcao;
        Conta conta = new Conta(001, "0001", 1000, "Israel");

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Transferir");
            System.out.println("4 - Ver saldo");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Opção de sacar selecionada.");
                    double valorSacar = 0;
                    controller.sacar(conta, valorSacar);
                    break;

                case 2:
                    System.out.println("Opção de depositar selecionada.");
                    double valorDepositado = 0;
                    controller.depositar(conta, valorDepositado);
                    break;

                case 3:
                    System.out.println("Opção de transferir selecionada.");
                    int valorTransferido = 0;
                    controller.transferir(conta, valorTransferido);
                    break;

                case 4:
                    System.out.println("Opção de ver saldo selecionada.");
                    Object valorSaldo = conta.getSaldo();
                    controller.consultarSaldo(conta, valorSaldo);
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println();

        } while (opcao != 0);
    }


}
