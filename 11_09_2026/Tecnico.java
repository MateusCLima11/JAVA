public class Tecnico extends Funcionario {
    private String setor;

    public Tecnico(String nome, float salario, String setor) {
        super(nome, salario);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Setor: " + setor);
    }
}