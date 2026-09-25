public class ProdutoFisico extends Produto {
    private double frete;

    public ProdutoFisico(int codigo, String nome, double preco, double frete) {
        // herda
        super(codigo, nome, preco);
        this.frete = frete;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    // Implementação dos métodos da interface Venda
    @Override
    public double vender(int quantidade) {
        return (getPreco() * quantidade) + frete;
    }

    // Sobrecarga com desconto
    @Override
    public double vender(int quantidade, double percentualDesconto) {
        double subtotal = getPreco() * quantidade;
        double valorDesconto = subtotal * (percentualDesconto / 100.0);
        return (subtotal - valorDesconto) + frete;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Tipo: Produto Físico");
        System.out.printf("Frete: R$ %.2f%n", frete);
    }
}