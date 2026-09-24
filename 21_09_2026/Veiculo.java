public abstract class Veiculo implements Aluguel {

    private String placa;
    private String modelo;
    private int ano;
    private double valorDiaria;

    public Veiculo(String placa, String modelo, int ano, double valorDiaria) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.valorDiaria = valorDiaria;
    }

    // Getters Setters
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }
    
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    
    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }
    
    public double getValorDiaria() { return valorDiaria; }
    public void setValorDiaria(double valorDiaria) { this.valorDiaria = valorDiaria; }

    // sobreescrevendo e calculando
    @Override
    public double calcularAluguel(int dias) {
        return dias * valorDiaria;
    }

    @Override
    public double calcularAluguel(int dias, double desconto) {
        double total = calcularAluguel(dias);
        return total - (total * (desconto / 100.0));
    }

    // sobreescrever
    public void exibirDados() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.printf("Valor da diária: R$ %.2f\n", valorDiaria);
    }
}