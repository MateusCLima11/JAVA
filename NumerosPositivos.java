import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número (negativo para sair): ");
            numero = sc.nextInt();
        } while (numero >= 0);

        System.out.println("Número negativo digitado. Programa encerrado!");

        sc.close();
    }
}