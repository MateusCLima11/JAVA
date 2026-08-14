public class Formatacao {
    public static void main(String[] args) {
        String produto = "Notebook";
        double preco = 1999.99;
        int quantidade = 5;
        double preco_final;

        preco_final = preco * quantidade;

        System.out.printf(" Produto: %s%n Preço: %.2f%n Quantidade: %d%n Preço Final: %.2f%n", produto, preco, quantidade, preco_final);
    }
}
