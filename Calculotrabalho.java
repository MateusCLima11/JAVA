import java.util.Scanner;

public class Calculotrabalho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a força aplicada (em Newtons): ");
        double forca = scanner.nextDouble();

        System.out.print("Digite a distância percorrida (em metros): ");
        double distancia = scanner.nextDouble();

        double trabalho = forca * distancia;

        System.out.println("O trabalho realizado é de: " + trabalho + " Joules");

        scanner.close();
    }
}