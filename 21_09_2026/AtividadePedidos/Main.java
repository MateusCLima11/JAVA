package AtividadePedidos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pedido pedido = null;

        while (true) {
            System.out.println("\n========== SISTEMA DE PEDIDOS ==========");
            System.out.println("1. Cadastrar Pedido (Local/Delivery)");
            System.out.println("2. Mostrar Dados do Pedido");
            System.out.println("3. Pagar em Dinheiro");
            System.out.println("4. Pagar via PIX");
            System.out.println("5. Pagar com Cartão");
            System.out.println("6. Encerrar o Programa");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- CADASTRAR PEDIDO ---");
                    System.out.println("1 - Pedido Local");
                    System.out.println("2 - Pedido Delivery");
                    System.out.print("Escolha o tipo: ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Número do Pedido: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome do Cliente: ");
                    String nome = scanner.nextLine();

                    System.out.print("Valor do Pedido (R$): ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();

                    if (tipo == 1) {
                        pedido = new PedidoLocal(numero, nome, valor);
                        System.out.println("Pedido Local cadastrado com sucesso!");
                    } else if (tipo == 2) {
                        System.out.print("Endereço de Entrega: ");
                        String endereco = scanner.nextLine();
                        System.out.print("Taxa de Entrega (R$): ");
                        double taxa = scanner.nextDouble();
                        scanner.nextLine();

                        pedido = new PedidoDelivery(numero, nome, valor, endereco, taxa);
                        System.out.println("Pedido Delivery cadastrado com sucesso!");
                    } else {
                        System.out.println("Tipo de pedido inválido.");
                    }
                    break;

                case 2:
                    if (pedido == null) {
                        System.out.println("Nenhum pedido cadastrado.");
                    } else {
                        System.out.println("\n--- DADOS DO PEDIDO ---");
                        pedido.exibirDados();
                    }
                    break;

                case 3:
                    if (pedido == null) {
                        System.out.println("Cadastre um pedido antes de realizar o pagamento.");
                    } else {
                        double valorFinal = (pedido instanceof PedidoDelivery) 
                                ? ((PedidoDelivery) pedido).getValorTotal() 
                                : pedido.getValorPedido();
                        pedido.pagar(valorFinal);
                    }
                    break;

                case 4:
                    if (pedido == null) {
                        System.out.println("Cadastre um pedido antes de realizar o pagamento.");
                    } else {
                        System.out.print("Informe a chave PIX: ");
                        String chavePix = scanner.nextLine();
                        
                        double valorFinal = (pedido instanceof PedidoDelivery) 
                                ? ((PedidoDelivery) pedido).getValorTotal() 
                                : pedido.getValorPedido();
                        pedido.pagar(valorFinal, chavePix);
                    }
                    break;

                case 5:
                    if (pedido == null) {
                        System.out.println("Cadastre um pedido antes de realizar o pagamento.");
                    } else {
                        System.out.print("Informe a quantidade de parcelas: ");
                        int parcelas = scanner.nextInt();
                        scanner.nextLine();

                        double valorFinal = (pedido instanceof PedidoDelivery) 
                                ? ((PedidoDelivery) pedido).getValorTotal() 
                                : pedido.getValorPedido();
                        pedido.pagar(valorFinal, parcelas);
                    }
                    break;

                case 6:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}