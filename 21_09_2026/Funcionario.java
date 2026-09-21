public class Funcionario {
    
    // encapsulamento
    private String nome;
    private String cpf;

    // construtor
    public Funcionario(String nome, String cpf){
        this.nome=nome;
        this.cpf=cpf;
    }

    // Getters Setters
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    
    // exibir dados
    public String exibirDados() {
    return "Nome: " + nome + "\nCPF: " + cpf;
    }


}
