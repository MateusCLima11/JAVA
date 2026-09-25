package AtividadeAgencia;

public class Agencia {

    // encapsulamento
    private int numero;
    private String nome;

    // construtor
    public Agencia(int numero, String nome){
        this.numero=numero;
        this.nome=nome;
    }

    // Getters e Setters
    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero=numero;
    }

    public int getNome(){
    return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    // vai ser sobreescrito
    public void mostrarDados(){
        System.out.println("Número da Agência "+numero);
        System.out.println("Nome da Agência "+nome);
    }
}
