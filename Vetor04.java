import java.util.Scanner;

public class Vetor04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[3];

        //inserir
        for(int i=0;i<nomes.length;i++){
            System.out.println("informe o nome: ");
            nomes[i]=sc.nextLine();
        }
        //Listando
        System.out.println("Nomes cadastrado são: ");

        for (String nome : nomes) {
            System.out.println(nome);
        }
        for(int i=0;i<nomes.length;i++){
            System.out.println(nomes[i]);
        }
        sc.close();
    }
}