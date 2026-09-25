package AtividadeFuncionario;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nomeTemp = "";
        String cpfTemp = "";
        Funcionario funcionario = null;

        while (true) {
            System.out.println("\n--- MENU DE OPÇÕES ---");
            System.out.println("1. Cadastrar o funcionário");
            System.out.println("2. Escolher o tipo de funcionário");
            System.out.println("3. Mostrar os dados cadastrados");
            System.out.println("4. Calcular o pagamento");
            System.out.println("5. Calcular o pagamento com bónus");
            System.out.println("6. Consultar os dados do funcionário");
            System.out.println("7. Encerrar o programa");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de memória do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Introduza o nome do funcionário: ");
                    nomeTemp = scanner.nextLine();
                    System.out.print("Introduza o CPF do funcionário: ");
                    cpfTemp = scanner.nextLine();
                    System.out.println("Dados iniciais registados com sucesso!");
                    break;

                case 2:
                    if (nomeTemp.isEmpty() || cpfTemp.isEmpty()) {
                        System.out.println("Aviso: Registe primeiro o nome e CPF na Opção 1!");
                        break;
                    }
                    System.out.println("Escolha o tipo de funcionário:");
                    System.out.println("1. Funcionário CLT");
                    System.out.println("2. Funcionário Freelancer");
                    System.out.print("Opção: ");
                    int tipo = scanner.nextInt();

                    if (tipo == 1) {
                        System.out.print("Introduza o salário mensal: ");
                        float salario = scanner.nextFloat();
                        funcionario = new FuncionarioCLT(nomeTemp, cpfTemp, salario);
                        System.out.println("Funcionário CLT definido com sucesso!");
                    } else if (tipo == 2) {
                        System.out.print("Introduza as horas trabalhadas: ");
                        int horas = scanner.nextInt();
                        funcionario = new FuncionarioFree(nomeTemp, cpfTemp, horas);
                        System.out.println("Funcionário Freelancer definido com sucesso!");
                    } else {
                        System.out.println("Tipo de funcionário inválido!");
                    }
                    break;

                case 3:
                    if (funcionario != null) {
                        System.out.println("\n--- DADOS CADASTRADOS ---");
                        System.out.println(funcionario.exibirDados());
                    } else if (!nomeTemp.isEmpty()) {
                        System.out.println("\n--- DADOS PARCIAIS ---");
                        System.out.println("Nome: " + nomeTemp + "\nCPF: " + cpfTemp + "\n(Tipo de funcionário ainda não definido)");
                    } else {
                        System.out.println("Nenhum dado registado ainda.");
                    }
                    break;

                case 4:
                    if (funcionario instanceof Pagamento) {
                        Pagamento p = (Pagamento) funcionario;
                        System.out.println("Pagamento calculado: R$ " + p.calcularPagamento());
                    } else {
                        System.out.println("Registe e escolha o tipo do funcionário primeiro (Opções 1 e 2)!");
                    }
                    break;

                case 5:
                    if (funcionario instanceof Pagamento) {
                        System.out.print("Introduza o valor do bónus: ");
                        double bonus = scanner.nextDouble();
                        Pagamento p = (Pagamento) funcionario;
                        System.out.println("Pagamento com bónus: R$ " + p.calcularPagamento(bonus));
                    } else {
                        System.out.println("Registe e escolha o tipo do funcionário primeiro (Opções 1 e 2)!");
                    }
                    break;

                case 6:
                    if (funcionario != null) {
                        System.out.println("\n--- CONSULTA DE DADOS ---");
                        System.out.println(funcionario.exibirDados());
                    } else {
                        System.out.println("Nenhum funcionário encontrado para consulta.");
                    }
                    break;

                case 7:
                    System.out.println("A encerrar o programa...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida! Escolha um número entre 1 e 7.");
                    break;
            }
        }
    }
}