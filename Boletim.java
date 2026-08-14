import java.util.Scanner;
import java.util.Locale;

public class Boletim {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o nome do aluno: ");
        String nome_aluno = scanner.nextLine();

        System.out.print("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println();

        System.out.printf(Locale.US, "Aluno: %s%n Nota 1: %.2f%n Nota 2: %.2f%n Média: %.2f%n", nome_aluno, nota1, nota2, media);

        scanner.close();
    }
}