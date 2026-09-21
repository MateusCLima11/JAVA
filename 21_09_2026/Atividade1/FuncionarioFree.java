import Atividade1.Funcionario;

public class FuncionarioFree extends Funcionario{
    // encapsulamento
    private int horastrabalhadas;
    
    // construtor
    public FuncionarioFree(String nome, String cpf, int horastrabalhadas){
        super(nome,cpf);
        this.horastrabalhadas=horastrabalhadas;
    }

    // Getters Setters
    public int getHorastrbalhadas(){
        return horastrabalhadas;
    }

    public void setHorastrabalhadas(int horastrabalhadas){
        this.horastrabalhadas=horastrabalhadas;
    }

    // sobrescrevendo (polimorfismo)
    @Override
    public String exibirDados(){
        return super.exibirDados() + "\nHoras trabalhadas: " + horastrabalhadas;
    }

}
