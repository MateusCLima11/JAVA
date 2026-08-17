import java.util.Scanner;

public class ControlePorta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Senha pré-configurada no sistema
        String senhaCorreta = "1234mudar";

        System.out.println("Digite a senha de acesso: ");
        String senha = sc.nextLine();

        if (senha.equals(senhaCorreta)) {
            System.out.println("PORTA ABERTA");
        } else {
            System.out.println("SENHA NAO CONFERE");
        }

        sc.close();
    }
}