package AtividadeAgencia;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CADASTRO INICIAL");
        System.out.print("Número da agência: ");
        int numAgencia = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome da agência: ");
        String nomeAgencia = scanner.nextLine();

        Agencia agencia = new Agencia(numAgencia, nomeAgencia);

        System.out.print("Número da conta: ");
        int numConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Titular: ");
        String titular = scanner.nextLine();

        System.out.print("Saldo inicial: R$ ");
        double saldoInicial = scanner.nextDouble();
        scanner.nextLine();

        ContaCorrente conta = new ContaCorrente(numConta, titular, saldoInicial, agencia);

        while (true) {
            System.out.println("\nMENU");
            System.out.println("1 - Mostrar dados da conta");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Depositar");
            System.out.println("4 - Pagar com PIX");
            System.out.println("5 - Pagar com cartão");
            System.out.println("6 - Pagar em dinheiro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- DADOS DA CONTA ---");
                    conta.mostrarDados();
                    break;

                case 2:
                    System.out.println("\n--- CONSULTA DE SALDO ---");
                    conta.consultarSaldo();
                    break;

                case 3:
                    System.out.println("\n--- DEPÓSITO ---");
                    System.out.print("Informe o valor do depósito: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    scanner.nextLine();
                    conta.depositar(valorDeposito);
                    break;

                case 4:
                    System.out.println("\n--- PAGAMENTO VIA PIX ---");
                    System.out.print("Informe o valor do pagamento: R$ ");
                    double valorPix = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Informe a chave PIX: ");
                    String chavePix = scanner.nextLine();
                    conta.pagar(valorPix, chavePix);
                    break;

                case 5:
                    System.out.println("\n--- PAGAMENTO COM CARTÃO ---");
                    System.out.print("Informe o valor da compra: R$ ");
                    double valorCartao = scanner.nextDouble();
                    System.out.print("Informe a quantidade de parcelas: ");
                    int parcelas = scanner.nextInt();
                    scanner.nextLine();
                    conta.pagar(valorCartao, parcelas);
                    break;

                case 6:
                    System.out.println("\n--- PAGAMENTO EM DINHEIRO ---");
                    System.out.print("Informe o valor do pagamento: R$ ");
                    double valorDinheiro = scanner.nextDouble();
                    scanner.nextLine();
                    conta.pagar(valorDinheiro);
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}