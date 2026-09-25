package AtividadePedidos;
public class PedidoDelivery extends Pedido {
    private String endereco;
    private double taxaEntrega;

    public PedidoDelivery(int numeroPedido, String nomeCliente, double valorPedido, String endereco, double taxaEntrega) {
        // herda
        super(numeroPedido, nomeCliente, valorPedido);
        this.endereco = endereco;
        this.taxaEntrega = taxaEntrega;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    public double getValorTotal() {
        return getValorPedido() + taxaEntrega;
    }

    // pagamento dinheiro
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento em dinheiro no valor total de R$ %.2f (incluindo R$ %.2f de entrega) confirmado!%n", valor, taxaEntrega);
    }

    // pagamento pix
    @Override
    public void pagar(double valor, String chavePix) {
        System.out.printf("Pagamento via PIX no valor total de R$ %.2f (Chave: %s, com entrega) confirmado!%n", valor, chavePix);
    }

    // pagamento cartao
    @Override
    public void pagar(double valor, int parcelas) {
        double valorParcela = valor / parcelas;
        System.out.printf("Pagamento no cartão em %dx de R$ %.2f (Total com taxa: R$ %.2f) confirmado!%n", parcelas, valorParcela, valor);
    }

    // sobrescrevendo
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Tipo: Pedido Delivery");
        System.out.println("Endereço: " + endereco);
        System.out.printf("Taxa de Entrega: R$ %.2f%n", taxaEntrega);
        System.out.printf("Valor Total com Taxa: R$ %.2f%n", getValorTotal());
    }
}