import java.util.Scanner;

public class PrecoCDIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a cor do CD (Verde, Azul, Amarelo ou Vermelho): ");
        // Lê a entrada e converte para maiúsculas
        String cor = sc.nextLine().toUpperCase();

        if (cor.equals("VERDE")) {
            System.out.println("O preço do CD é: R$ 10,00");
        } else if (cor.equals("AZUL")) {
            System.out.println("O preço do CD é: R$ 20,00");
        } else if (cor.equals("AMARELO")) {
            System.out.println("O preço do CD é: R$ 30,00");
        } else if (cor.equals("VERMELHO")) {
            System.out.println("O preço do CD é: R$ 40,00");
        } else {
            System.out.println("Cor inválida! Por favor, insira uma das cores da tabela.");
        }

        sc.close();
    }
}