public interface Pagamento {
    
    // Método para calcular o pagamento padrão
    double calcularPagamento();

    // Sobrecarga de método que inclui o valor do bônus
    double calcularPagamento(double bonus);
}