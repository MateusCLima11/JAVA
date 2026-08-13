import java.util.Scanner;

public class Media2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        double media = (num1 + num2) / 2;

        System.out.println("A média dos números é: " + media);

        sc.close();
    }
}