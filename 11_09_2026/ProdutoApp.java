import java.util.Scanner;

public class ProdutoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto c =new Produto(null, 0, 0);
        System.out.println("Informe o nome do produto: ");
        c.setNome(sc.nextLine());

        System.out.println("Informe o preço do produto: ");
        c.setPreco(sc.nextFloat());

        System.out.println("Informe a quantidade: ");
        c.setQuantidade(sc.nextInt());

        sc.close();

        System.out.println("Produto: " + c.getNome());
        System.out.printf("Preço: R$ %.2f%n", c.getPreco());
        System.out.println("Quantidade: " + c.getQuantidade());
        System.out.printf("Valor Total: R$ %.2f%n", c.getValorTotal());
    }
}