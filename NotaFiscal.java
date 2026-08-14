import java.util.Scanner;
import java.util.Locale;

public class NotaFiscal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o valor unitário: ");
        double valorUnitario = scanner.nextDouble();

        double total = quantidade * valorUnitario;

        System.out.printf("%n---------- NOTA FISCAL ----------%n");
        System.out.printf("Cliente: %s%n", nomeCliente);
        System.out.printf("Produto: %s%n", nomeProduto);
        System.out.printf("Quantidade: %d%n", quantidade);
        System.out.printf("Valor unitário: R$ %.2f%n", valorUnitario);
        System.out.printf("Total: R$ %.2f%n", total);
        System.out.printf("---------------------------------%n");

        scanner.close();
    }
}