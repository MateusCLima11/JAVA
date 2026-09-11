public class Professor extends Funcionario {
    private String disciplina;

    public Professor(String nome, float salario, String disciplina) {
        super(nome, salario);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Disciplina: " + disciplina);
    }
}