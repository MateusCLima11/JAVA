package AtividadeProduto;
public class ProdutoDigital extends Produto {

    public ProdutoDigital(int codigo, String nome, double preco) {
        // herda
        super(codigo, nome, preco);
    }

    // Implementação dos métodos da interface Venda (Sem frete)
    @Override
    public double vender(int quantidade) {
        return getPreco() * quantidade;
    }

    // Sobrecarga com desconto
    @Override
    public double vender(int quantidade, double percentualDesconto) {
        double subtotal = getPreco() * quantidade;
        double valorDesconto = subtotal * (percentualDesconto / 100.0);
        return subtotal - valorDesconto;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Tipo: Produto Digital (Isento de Frete)");
    }
}