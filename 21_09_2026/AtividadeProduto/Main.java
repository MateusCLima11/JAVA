package AtividadeProduto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = null;

        while (true) {
            System.out.println("\n========== MENU DE SISTEMA ==========");
            System.out.println("1. Cadastrar Produto (Físico/Digital)");
            System.out.println("2. Mostrar Dados do Produto");
            System.out.println("3. Realizar Venda");
            System.out.println("4. Realizar Venda com Desconto");
            System.out.println("5. Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- CADASTRAR PRODUTO ---");
                    System.out.println("1 - Produto Físico");
                    System.out.println("2 - Produto Digital");
                    System.out.print("Escolha o tipo: ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Código: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Preço (R$): ");
                    double preco = scanner.nextDouble();

                    if (tipo == 1) {
                        System.out.print("Valor do Frete (R$): ");
                        double frete = scanner.nextDouble();
                        produto = new ProdutoFisico(codigo, nome, preco, frete);
                        System.out.println("Produto Físico cadastrado com sucesso!");
                    } else if (tipo == 2) {
                        produto = new ProdutoDigital(codigo, nome, preco);
                        System.out.println("Produto Digital cadastrado com sucesso!");
                    } else {
                        System.out.println("Tipo inválido. Cadastro cancelado.");
                    }
                    break;

                case 2:
                    if (produto == null) {
                        System.out.println("Nenhum produto cadastrado até o momento.");
                    } else {
                        System.out.println("\n--- DADOS DO PRODUTO ---");
                        produto.exibirDados();
                    }
                    break;

                case 3:
                    if (produto == null) {
                        System.out.println("Cadastre um produto antes de realizar uma venda.");
                    } else {
                        System.out.print("Informe a quantidade desejada: ");
                        int qtd = scanner.nextInt();
                        double valorTotal = produto.vender(qtd);
                        System.out.printf("Valor final da compra: R$ %.2f%n", valorTotal);
                    }
                    break;

                case 4:
                    if (produto == null) {
                        System.out.println("Cadastre um produto antes de realizar uma venda.");
                    } else {
                        System.out.print("Informe a quantidade desejada: ");
                        int qtd = scanner.nextInt();
                        System.out.print("Informe o percentual de desconto (%): ");
                        double desconto = scanner.nextDouble();
                        
                        double valorTotalComDesconto = produto.vender(qtd, desconto);
                        System.out.printf("Valor final da compra com desconto: R$ %.2f%n", valorTotalComDesconto);
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida! Escolha um número do menu.");
            }
        }
    }
}