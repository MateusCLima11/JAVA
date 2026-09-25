package AtividadeCurso;
public class CursoPresencial extends Curso {
    private String sala;
    private String turno;

    public CursoPresencial(int codigo, String nome, int cargaHoraria, double valor, String sala, String turno) {
        super(codigo, nome, cargaHoraria, valor);
        this.sala = sala;
        this.turno = turno;
    }

    // Getters e Setters
    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    // sobrescrevendo matrícula
    @Override
    public double realizarMatricula() {
        return getValor();
    }

    // sobrecarga
    @Override
    public double realizarMatricula(double percentualDesconto) {
        double desconto = getValor() * (percentualDesconto / 100.0);
        return getValor() - desconto;
    }

    // sobrescrevendo
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Modalidade: Presencial");
        System.out.println("Sala: " + sala);
        System.out.println("Turno: " + turno);
    }
}