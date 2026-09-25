package AtividadeFuncionario;
public class FuncionarioCLT extends Funcionario implements Pagamento{
    
    // encapsulamento
    private float salariomes;

    // construtor
    public FuncionarioCLT(String nome, String cpf, float salariomes){
        super(nome, cpf);
        this.salariomes=salariomes;
    }

    // Getters Setters
    public float getSalariomes(){
    return salariomes;
    }

    public void setSalariomes(float salariomes){
        this.salariomes=salariomes;
    }

    // Cálculo do pagamento padrão (salário mensal)
    @Override
    public double calcularPagamento() {
        return salariomes;
    }

    // Cálculo com bônus
    @Override
    public double calcularPagamento(double bonus) {
        return salariomes + bonus;
    }

    // sobrescrever (polimorfismo)
    @Override
    public String exibirDados() {
        return super.exibirDados() + "\nTipo: CLT\nSalário Mensal: R$ " + salariomes;
    }
}