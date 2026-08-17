import java.util.Scanner;

public class PrecoCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a cor do CD (Verde, Azul, Amarelo ou Vermelho): ");
        // Lê a entrada e converte para maiúsculas para evitar erros de digitação (ex: Verde, verde, VERDE)
        String cor = sc.nextLine().toUpperCase(); 

        switch (cor) {
            case "VERDE":
                System.out.println("O preço do CD é: R$ 10,00");
                break;
            case "AZUL":
                System.out.println("O preço do CD é: R$ 20,00");
                break;
            case "AMARELO":
                System.out.println("O preço do CD é: R$ 30,00");
                break;
            case "VERMELHO":
                System.out.println("O preço do CD é: R$ 40,00");
                break;
            default:
                System.out.println("Cor inválida! Por favor, insira uma das cores da tabela.");
                break;
        }

        sc.close();
    }
}