import java.util.Scanner;

public class MenuCanetas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- TIPOS DE CANETAS ---");
            System.out.println("1 - Caneta Esferográfica");
            System.out.println("2 - Caneta Gel");
            System.out.println("3 - Caneta Tinteiro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nCaneta Esferográfica: Econômica e de longa duração");
                    break;
                case 2:
                    System.out.println("\nCaneta Gel: Tinta mais pigmentada e escrita suave");
                    break;
                case 3:
                    System.out.println("\nCaneta Tinteiro: Clássica e elegante, usada para caligrafia");
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