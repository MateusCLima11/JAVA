import java.util.Scanner;

public class GerenciadorNumeros {
    private static final int TAMANHO_MAXIMO = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[TAMANHO_MAXIMO];
        int quantidade = 0;
        int opcao;

        do {
            System.out.println("\n=== MENU DE GERENCIAMENTO ===");
            System.out.println("1. Inserir número");
            System.out.println("2. Listar números");
            System.out.println("3. Remover número");
            System.out.println("4. Sair");
            System.out.print("Opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if (quantidade >= TAMANHO_MAXIMO) {
                        System.out.println("Erro: O array está cheio! Não é possível inserir novos números.");
                    } else {
                        System.out.print("Digite o número a ser inserido: ");
                        int numero = scanner.nextInt();
                        numeros[quantidade] = numero;
                        quantidade++;
                        System.out.println("Número inserido com sucesso!");
                    }
                    break;

                case 2:
                    if (quantidade == 0) {
                        System.out.println("Não há números cadastrados.");
                    } else {
                        System.out.println("\n--- Lista de Números ---");
                        for (int i = 0; i < quantidade; i++) {
                            System.out.println("Índice [" + i + "]: " + numeros[i]);
                        }
                    }
                    break;

                case 3:
                    if (quantidade == 0) {
                        System.out.println("Erro: O array está vazio. Não há o que remover.");
                    } else {
                        System.out.print("Digite o índice que deseja remover (0 a " + (quantidade - 1) + "): ");
                        int indice = scanner.nextInt();

                        if (indice < 0 || indice >= quantidade) {
                            System.out.println("Erro: Índice inválido!");
                        } else {

                            for (int i = indice; i < quantidade - 1; i++) {
                                numeros[i] = numeros[i + 1];
                            }
                            quantidade--;
                            System.out.println("Número removido com sucesso!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Escolha um número de 1 a 4.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}