import java.util.Scanner;

public class VeiculoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n=== Sistema de cadastro de veiculos ===");
            System.out.println("1 - Moto");
            System.out.println("2 - Carro");
            System.out.println("0 - Sair do programa");
            System.out.println("Escolha a opção: ");

            while (!sc.hasNextInt()) {
                System.out.println("Opção invalida! Digite 0,1 ou 2");
                sc.next();
            }
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1: {
                    System.out.println("\n--- Cadastro de moto ---");
                    System.out.print("Informe a Marca: ");
                    String marca = sc.nextLine();

                    System.out.println("Informe o ano: ");
                    int ano = sc.nextInt();

                    System.out.println("informe a Cilindrada");
                    float cilindrada = sc.nextFloat();

                    VeiculoMoto vm = new VeiculoMoto(marca, ano, cilindrada);
                    System.out.println("\n--- Dados da moto cadastrada ---");
                    vm.exibirDados();
                    break;
                }
                case 2: {
                    System.out.println("\n--- Cadastro de carro ---");
                    System.out.print("Informe a marca: ");
                    String marca = sc.nextLine();

                    System.out.println("Informe o ano: ");
                    int ano = sc.nextInt();

                    System.out.println("Informe a quantidade de portas");
                    int qntportas = sc.nextInt();

                    VeiculoCarro vc = new VeiculoCarro(marca, ano, qntportas);
                    System.out.println("\n--- Dados do carro cadastrado ---");
                    vc.exibirDados();
                    break;
                }
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
            
                default:
                    System.out.println("Opção invalida! tente novamente.");
                    break;
            }
        
        
        } while (op != 0);

        sc.close();
    }
}