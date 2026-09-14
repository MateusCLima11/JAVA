public class Contato {

    // Atributos privados declarados no escopo da classe
    private String nome;
    private String numero;

    // Construtor para inicializar o objeto
    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    // Getters e Setters para o atributo 'nome'
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getters e Setters para o atributo 'numero' (faltavam no código original)
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    // Método utilitário para exibir os dados do contato
    @Override
    public String toString() {
        return "Nome: " + nome + " | Telefone: " + numero;
    }
}