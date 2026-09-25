package AtividadeAgencia;

public class ContaCorrente extends Conta implements Pagamento {

    // construtor
    public ContaCorrente(int numeroConta, String titular, double saldo, Agencia agencia) {
        super(numeroConta, titular, saldo, agencia);
    }

    // pagamento dinheiro
    @Override
    public void pagar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do pagamento deve ser maior que zero.");
            return;
        }
        if (valor > getSaldo()) {
            System.out.println("Erro: Saldo insuficiente para realizar o pagamento.");
            return;
        }

        setSaldo(getSaldo() - valor);
        System.out.printf("Pagamento de R$ %.2f em dinheiro realizado com sucesso!%n", valor);
        consultarSaldo();
    }

    // pagamento pix
    @Override
    public void pagar(double valor, String chavePix) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do pagamento deve ser maior que zero.");
            return;
        }
        if (valor > getSaldo()) {
            System.out.println("Erro: Saldo insuficiente para realizar o pagamento.");
            return;
        }

        setSaldo(getSaldo() - valor);
        System.out.printf("Pagamento via PIX de R$ %.2f (Chave: %s) realizado com sucesso!%n", valor, chavePix);
        consultarSaldo();
    }

    // pagamento cartao
    @Override
    public void pagar(double valor, int parcelas) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do pagamento deve ser maior que zero.");
            return;
        }
        if (parcelas <= 0) {
            System.out.println("Erro: A quantidade de parcelas deve ser maior que zero.");
            return;
        }
        if (valor > getSaldo()) {
            System.out.println("Erro: Saldo insuficiente para realizar o pagamento.");
            return;
        }

        double valorParcela = valor / parcelas;
        setSaldo(getSaldo() - valor);
        System.out.printf("Pagamento no cartão no valor total de R$ %.2f (%dx de R$ %.2f) realizado com sucesso!%n", 
                            valor, parcelas, valorParcela);
        consultarSaldo();
    }
}
