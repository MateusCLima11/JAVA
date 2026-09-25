package AtividadePedidos;
public class PedidoLocal extends Pedido {

    public PedidoLocal(int numeroPedido, String nomeCliente, double valorPedido) {
        // herda
        super(numeroPedido, nomeCliente, valorPedido);
    }

    // pagamento dinheiro
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento em dinheiro de R$ %.2f confirmado com sucesso!%n", valor);
    }

    // Pagamento pix
    @Override
    public void pagar(double valor, String chavePix) {
        System.out.printf("Pagamento via PIX no valor de R$ %.2f (Chave: %s) confirmado com sucesso!%n", valor, chavePix);
    }

    // Pagamento no cartao
    @Override
    public void pagar(double valor, int parcelas) {
        double valorParcela = valor / parcelas;
        System.out.printf("Pagamento no cartão em %dx de R$ %.2f (Total: R$ %.2f) confirmado com sucesso!%n", parcelas, valorParcela, valor);
    }

    // sobrescrevendo
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Tipo: Pedido Local");
    }
}