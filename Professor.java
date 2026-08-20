import java.util.Scanner;

public class Professor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;

        do {
            System.out.print("Digite o nome do professor mais fofo do SENAI: ");
            nome = sc.nextLine();
        } while (!nome.equalsIgnoreCase("Anderson"));

        System.out.println("Acertou! Resposta correta!");

        sc.close();
    }
}