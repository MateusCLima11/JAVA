import java.util.Scanner;

public class MenuEmbalagensWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- TIPOS DE EMBALAGENS ---");
            System.out.println("1 - Caixa de papelão");
            System.out.println("2 - Sacola plástica");
            System.out.println("3 - Embalagem de vidro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nCaixa de papelão: Ideal para transporte e armazenamento.");
                    break;
                case 2:
                    System.out.println("\nSacola plástica: Leve e prática, mas pouco sustentável.");
                    break;
                case 3:
                    System.out.println("\nEmbalagem de vidro: Resistente e reutilizável.");
                    break;
                case 0:
                    System.out.println("\nEncerrando o programa...");
                    break;
                default:
                    System.out.println("\nOpção inválida! Escolha um número do menu.");
                    break;
            }
        }

        sc.close();
    }
}