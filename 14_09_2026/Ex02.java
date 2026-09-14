import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        System.out.println("Números cadastrados:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        System.out.print("\nDigite o número que deseja remover: ");
        int numeroRemover = sc.nextInt();

        numeros.remove(Integer.valueOf(numeroRemover));

        System.out.println("\nApós remover:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        sc.close();
    }
}