package AtividadeFuncionario;
public interface Pagamento {
    
    // calcula pagamento normal
    double calcularPagamento();

    // calcula pagamento com bonus
    double calcularPagamento(double bonus);
}