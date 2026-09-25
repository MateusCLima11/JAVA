package AtividadeCurso;
public class CursoOnline extends Curso {
    private String plataforma;
    private String codigoAcesso;

    public CursoOnline(int codigo, String nome, int cargaHoraria, double valor, String plataforma, String codigoAcesso) {
        // herda
        super(codigo, nome, cargaHoraria, valor);
        this.plataforma = plataforma;
        this.codigoAcesso = codigoAcesso;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getCodigoAcesso() {
        return codigoAcesso;
    }

    public void setCodigoAcesso(String codigoAcesso) {
        this.codigoAcesso = codigoAcesso;
    }

    // sobrescrevendo
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
        System.out.println("Modalidade: Online");
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Código de Acesso: " + codigoAcesso);
    }
}