package AtividadeAgencia;

public abstract class Conta {
    // encapsulamento
    private int numeroConta;
    private String titular;
    private double saldo;
    private Agencia agencia;

    // cosntrutor
    public Conta(int numeroConta, String titular, double saldo, Agencia agencia) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.agencia = agencia;
    }

    // Getters e Setters
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    // metodo depositar 
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do depósito deve ser maior que zero.");
        } else {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso!%n", valor);
            consultarSaldo();
        }
    }

    // metodo consultar saldo
    public void consultarSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    // metodo mostrar dados
    public void mostrarDados() {
        System.out.println("Número da Agência: " + agencia.getNumero());
        System.out.println("Nome da Agência: " + agencia.getNome());
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }
}