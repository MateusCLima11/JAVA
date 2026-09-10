import java.util.Scanner;

public class CarroApp {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Carro c =new Carro(null, null, 0);
        System.out.println("Informe a marca do carro: ");
        c.setMarca(sc.nextLine());

        System.out.print("Informe o modelo do carro: ");
        c.setModelo(sc.nextLine());

        System.out.println("Informe o ano de fabricação do carro: ");
        c.setAnofabricacao(sc.nextInt());

        sc.close();

        System.out.println("A Marca: "+c.getMarca());
        System.out.println("O Modelo: "+c.getModelo());
        System.out.println("O Ano de fabricação: "+c.getAnofabricacao());
    }
}
