import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Veiculo veiculo = null;
        int dias = 0;

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Cadastrar um veículo");
            System.out.println("2. Mostrar os dados do veículo");
            System.out.println("3. Informar a quantidade de dias");
            System.out.println("4. Calcular o valor do aluguel");
            System.out.println("5. Calcular o aluguel com desconto");
            System.out.println("6. Encerrar o programa");
            System.out.print("Opção: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Opção inválida. Insira um número.");
                scanner.nextLine();
                continue;
            }

            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Informe a Placa: ");
                    String placa = scanner.nextLine();

                    System.out.print("Informe o Modelo: ");
                    String modelo = scanner.nextLine();

                    System.out.print("Informe o Ano: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Ano inválido. Informe o Ano: ");
                        scanner.next();
                    }
                    int ano = scanner.nextInt();

                    System.out.print("Informe o Valor da Diária: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.print("Valor inválido. Informe o Valor da Diária: ");
                        scanner.next();
                    }
                    double valorDiaria = scanner.nextDouble();
                    scanner.nextLine();


                    System.out.println("\nTipo de veículo:");
                    System.out.println("1 - Carro");
                    System.out.println("2 - Moto");
                    System.out.print("Escolha o tipo: ");

                    int tipo = 0;
                    if (scanner.hasNextInt()) {
                        tipo = scanner.nextInt();
                        scanner.nextLine();
                    }

                    if (tipo == 1) {
                        veiculo = new Carro(placa, modelo, ano, valorDiaria);
                        System.out.println("Carro cadastrado com sucesso!");
                    } else if (tipo == 2) {
                        veiculo = new Moto(placa, modelo, ano, valorDiaria);
                        System.out.println("Moto cadastrada com sucesso!");
                    } else {
                        System.out.println("Tipo inválido. O veículo não foi criado.");
                    }
                    break;

                case 2:
                    if (veiculo != null) {
                        veiculo.exibirDados();
                    } else {
                        System.out.println("Nenhum veículo cadastrado.");
                    }
                    break;

                case 3:
                    System.out.print("Informe a quantidade de dias: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Quantidade inválida. Informe os dias: ");
                        scanner.next();
                    }
                    dias = scanner.nextInt();
                    scanner.nextLine();
                    break;

                case 4:
                    if (veiculo == null) {
                        System.out.println("Nenhum veículo cadastrado.");
                    } else if (dias <= 0) {
                        System.out.println("Informe primeiro a quantidade de dias na Opção 3.");
                    } else {
                        double total = veiculo.calcularAluguel(dias);
                        System.out.printf("Valor do aluguel: R$ %.2f\n", total);
                    }
                    break;

                case 5:
                    if (veiculo == null) {
                        System.out.println("Nenhum veículo cadastrado.");
                    } else if (dias <= 0) {
                        System.out.println("Informe primeiro a quantidade de dias na Opção 3.");
                    } else {
                        System.out.print("Informe a percentagem de desconto (%): ");
                        while (!scanner.hasNextDouble()) {
                            System.out.print("Valor inválido. Informe o desconto: ");
                            scanner.next();
                        }
                        double desconto = scanner.nextDouble();
                        scanner.nextLine();

                        double totalComDesconto = veiculo.calcularAluguel(dias, desconto);
                        System.out.printf("Valor do aluguel com desconto: R$ %.2f\n", totalComDesconto);
                    }
                    break;

                case 6:
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}