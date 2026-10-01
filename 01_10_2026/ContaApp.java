import java.util.Scanner;

public class ContaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        cadastroConta repositorio = new cadastroConta();
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Cadastrar Conta");
            System.out.println("2. Buscar Conta");
            System.out.println("3. Remover Conta");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o número da conta: ");
                        String numero = scanner.nextLine();

                        System.out.print("Digite o nome do titular: ");
                        String titular = scanner.nextLine();

                        System.out.print("Digite o saldo inicial: ");
                        double saldo = Double.parseDouble(scanner.nextLine());

                        Conta novaConta = new Conta(numero, titular, saldo);
                        repositorio.inserir(novaConta);
                        System.out.println("Conta cadastrada com sucesso!");
                        break;

                    case 2:
                        System.out.print("Digite o número da conta que deseja buscar: ");
                        String numBusca = scanner.nextLine();

                        Conta contaEncontrada = repositorio.buscar(numBusca);
                        System.out.println("\n--- DADOS DA CONTA ---");
                        System.out.println("Titular: " + contaEncontrada.getTitular());
                        System.out.println("Saldo: R$ " + contaEncontrada.getSaldo());
                        break;

                    case 3:
                        System.out.print("Digite o número da conta que deseja remover: ");
                        String numRemover = scanner.nextLine();

                        repositorio.remover(numRemover);
                        System.out.println("Operação realizada com sucesso! Conta removida.");
                        break;

                    case 4:
                        System.out.println("Encerrando o programa...");
                        break;

                    default:
                        System.out.println("Opção inválida. Escolha um número de 1 a 4.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro de Entrada: Digite apenas números válidos.");
            } catch (ExcecaoDadoInvalido | ExcecaoElementoJaExistente | ExcecaoElementoInexistente | ExcecaoRepositorio e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        scanner.close();
    }
}