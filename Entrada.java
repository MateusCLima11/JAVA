import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        
        System.out.println("Digite sua 1ª nota: ");
        double nota1 = sc.nextDouble();
        
        System.out.print("Digite sua 2ª nota: ");
        double nota2 = sc.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        // concatenação de variáveis
        System.out.println("Olá "+nome+", você tem "+idade+" anos e sua média é "+media+".");
        
        sc.close();
    }
}
