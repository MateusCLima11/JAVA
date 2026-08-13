import java.util.Scanner;

public class OperacoesBasicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("\n--- Resultados ---");
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        
        if (num2 != 0) {
            System.out.println("Divisão: " + (num1 / num2));
        } else {
            System.out.println("Divisão: Não é possível dividir por zero.");
        }

        scanner.close();
    }
}