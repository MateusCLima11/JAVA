import java.util.Scanner;

public class ClienteApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op;

        do {
            System.out.println("\n===Sistema de cadastro de clientes===");
            System.out.println("1 - Pessoa Fisica");
            System.out.println("2 - Pessoa Jurídica");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            while (!sc.hasNextInt()) {
                System.out.println("Opção Inválida, digite 0, 1 ou 2");
                sc.next();
            }
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("informe o nome: ");
                    String nomePF = sc.nextLine();

                    System.out.println("informe o endereço: ");
                    String enderecoPF = sc.nextLine();

                    System.out.println("informe o cpf: ");
                    String cpf = sc.nextLine();

                    ClientePF pf = new ClientePF(nomePF, enderecoPF, cpf);

                    System.out.println("\n --Dados do cliente PF---");
                    pf.exibirDados();
                    break;

                case 2:
                    System.out.println("informe o nome: ");
                    String nomePJ = sc.nextLine();

                    System.out.println("informe o endereço: ");
                    String enderecoPJ = sc.nextLine();

                    System.out.println("informe o cnpj: ");
                    String cnpj = sc.nextLine();

                    ClientePJ pj = new ClientePJ(nomePJ, enderecoPJ, cnpj);

                    System.out.println("\n --Dados do cliente PJ---");
                    pj.exibirDados();
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (op != 0);

        sc.close();
    }
}