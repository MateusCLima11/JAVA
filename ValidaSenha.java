import java.util.Scanner;

public class ValidaSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;

        do {
            System.out.print("Digite a senha de 4 dígitos: ");
            senha = sc.nextInt();

            if (senha != 2024) {
                System.out.println("Senha incorreta! Tente novamente.");
            }
        } while (senha != 2024);

        System.out.println("Acesso Permitido");

        sc.close();
    }
}