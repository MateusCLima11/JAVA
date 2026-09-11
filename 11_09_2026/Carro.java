public class Carro extends Veiculo{
    private int qtdportas;

    public Carro(String marca, int ano, int qtdportas){
        super(marca, ano);
    }

    public int getQtdportas(){
        return qtdportas;
    }

    public void setQtdportas(int qtdportas){
        this.qtdportas = qtdportas;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Quantidade de portas: " +qtdportas);
    }
}
