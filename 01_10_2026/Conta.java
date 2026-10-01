public class Conta {
    // encapsula
    private String numero;
    private String titular;
    private double saldo;

    // construtor
    public Conta(String numero, String titular, double saldo) throws ExcecaoDadoInvalido {
        setNumero(numero);
        setTitular(titular);
        setSaldo(saldo);
    }

    // Getters Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) throws ExcecaoDadoInvalido {
        if (numero == null || numero.trim().isEmpty()) {
            throw new ExcecaoDadoInvalido("Número da conta não pode ser vazio.");
        }
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) throws ExcecaoDadoInvalido {
        if (titular == null || titular.trim().isEmpty()) {
            throw new ExcecaoDadoInvalido("Nome do titular não pode ser vazio.");
        }
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) throws ExcecaoDadoInvalido {
        if (saldo < 0) {
            throw new ExcecaoDadoInvalido("Saldo inicial não pode ser negativo.");
        }
        this.saldo = saldo;
    }
}