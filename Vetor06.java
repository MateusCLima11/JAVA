import java.util.Scanner;

public class Vetor06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes;
        int[] idades;

        System.out.println("Quantidades de pessoas que deseja cadastrar:");
        int quantidade = sc.nextInt();

        nomes = new String[quantidade];
        idades = new int[quantidade];

        for(int i=0;i<quantidade;i++){
            System.out.println("Digite o nome");
            nomes[i]=sc.next();

            System.out.println("Digite a idade");
            idades[i]=sc.nextInt();
            sc.nextLine();
        }
        for(int i=0;i<quantidade;i++){
            System.out.println(nomes[i]+" -"+idades[i]+" anos");
        }

        sc.close();
    }
}
