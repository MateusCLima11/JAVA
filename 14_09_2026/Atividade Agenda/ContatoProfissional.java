public class ContatoProfissional extends Contato{
    private String empresa;
    private String cargo;

    public ContatoProfissional(String nome, String numero, String empresa, String cargo){
        super(nome, numero);
        this.empresa=empresa;
        this.cargo=cargo;
    }

    // Getters e Setters
    public String getEmpresa(){
        return empresa;
    }

    public void setEmpresa(String empresa){
        this.empresa=empresa;
    }

    public String setCargo(){
        return cargo;
    }

    public void getCargo(String cargo){
        this.cargo=cargo;
    }

    // Método sobrescrito
    @Override
    public String exibirDados() {
        return super.exibirDados() + "\nTipo: Profissional\nEmpresa: " + empresa + "\nCargo: " + cargo;
    }
}
