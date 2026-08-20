import java.util.Scanner;

public class Dw5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Iniciar jogo");
            System.out.println("2 - Carregar jogo");
            System.out.println("3 - Configurações");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Iniciando o jogo...");
                    break;
                case 2:
                    System.out.println("Carregando o jogo...");
                    break;
                case 3:
                    System.out.println("Abrindo configurações...");
                    break;
                case 0:
                    System.out.println("Saindo do jogo. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (op != 0);

        sc.close();
    }
}