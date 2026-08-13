import java.util.Scanner;

public class Calculoimc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura (em metros, ex: 1.75): ");
        double altura = scanner.nextDouble();

        // Math.pow pode ser usado, mas multiplicar a altura por ela mesma é direto e eficiente
        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);

        scanner.close();
    }
}
