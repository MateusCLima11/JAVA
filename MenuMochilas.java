import java.util.Scanner;

public class MenuMochilas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- TIPOS DE MOCHILAS ---");
            System.out.println("1 - Mochila Escolar");
            System.out.println("2 - Mochila de Viagem");
            System.out.println("3 - Mochila Esportiva");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nMochila Escolar: Compacta e ideal para estudantes");
                    break;
                case 2:
                    System.out.println("\nMochila de Viagem: Espaçosa, ideal para longas jornadas");
                    break;
                case 3:
                    System.out.println("\nMochila Esportiva: Leve, resistente e ergonômica");
                    break;
                case 0:
                    System.out.println("\nEncerrando o programa...");
                    break;
                default:
                    System.out.println("\nOpção inválida! Escolha um número do menu.");
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}