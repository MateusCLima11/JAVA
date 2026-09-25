package AtividadePedidos;
public abstract class Pedido implements Pagamento {
    // encapsulamento
    private int numeroPedido;
    private String nomeCliente;
    private double valorPedido;

    public Pedido(int numeroPedido, String nomeCliente, double valorPedido) {
        this.numeroPedido = numeroPedido;
        this.nomeCliente = nomeCliente;
        this.valorPedido = valorPedido;
    }

    // Getters e Setters
    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    // sobreescrever
    public void exibirDados() {
        System.out.println("Número do Pedido: " + numeroPedido);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.printf("Valor do Pedido: R$ %.2f%n", valorPedido);
    }
}