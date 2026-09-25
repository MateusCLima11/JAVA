package AtividadeCurso;
public abstract class Curso implements Matricula {
    // encapsulamaento
    private int codigo;
    private String nome;
    private int cargaHoraria;
    private double valor;

    public Curso(int codigo, String nome, int cargaHoraria, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.valor = valor;
    }

    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // sobreescrever
    public void exibirDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome do Curso: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria + "h");
        System.out.printf("Valor do Curso: R$ %.2f%n", valor);
    }
}