public class FuncionarioFree extends Funcionario implements Pagamento {

    // define valor fixo a ser pago por hora
    private static final double valorfixo = 50.00;
    // encapsulamento
    private int horastrabalhadas;
    
    // construtor
    public FuncionarioFree(String nome, String cpf, int horastrabalhadas){
        super(nome, cpf);
        this.horastrabalhadas = horastrabalhadas;
    }

    // Getters Setters
    public int getHorastrabalhadas(){
        return horastrabalhadas;
    }

    public void setHorastrabalhadas(int horastrabalhadas){
        this.horastrabalhadas = horastrabalhadas;
    }

    // get estático
    public static double getValorfixo() {
        return valorfixo;
    }

    // Cálculo do pagamento padrão (horas x valor por hora)
    @Override
    public double calcularPagamento() {
        return horastrabalhadas * valorfixo;
    }

    // Cálculo do pagamento com bónus
    @Override
    public double calcularPagamento(double bonus) {
        return (horastrabalhadas * valorfixo) + bonus;
    }

    // sobrescrevendo (polimorfismo)
    @Override
    public String exibirDados(){
        return super.exibirDados() + "\nTipo: Freelancer\nHoras trabalhadas: " + horastrabalhadas + "\nValor por hora: R$ " + valorfixo;
    }
}