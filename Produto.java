import java.util.Scanner;
import java.util.Locale;

public class Produto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o preço unitário: ");
        double precoUnitario = scanner.nextDouble();

        System.out.println();

        System.out.printf(Locale.US, "Produto: %s%n", nomeProduto);
        System.out.printf(Locale.US, "Quantidade: %d%n", quantidade);
        System.out.printf(Locale.US, "Preço unitário: R$ %.2f%n", precoUnitario);

        scanner.close();
    }
}