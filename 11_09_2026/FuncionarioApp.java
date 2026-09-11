import java.util.Scanner;

public class FuncionarioApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Professor professor = null;
        Tecnico tecnico = null;
        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE FUNCIONÁRIOS =====");
            System.out.println("1 - Cadastrar Professor");
            System.out.println("2 - Cadastrar Técnico");
            System.out.println("3 - Exibir Professor");
            System.out.println("4 - Exibir Técnico");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Cadastro de Professor ---");
                    System.out.print("Nome: ");
                    String nomeProf = sc.nextLine();

                    System.out.print("Salário: ");
                    double salarioProf = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Disciplina: ");
                    String disciplina = sc.nextLine();

                    professor = new Professor(nomeProf, salarioProf, disciplina);
                    System.out.println("Professor cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Cadastro de Técnico ---");
                    System.out.print("Nome: ");
                    String nomeTec = sc.nextLine();

                    System.out.print("Salário: ");
                    double salarioTec = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Setor: ");
                    String setor = sc.nextLine();

                    tecnico = new Tecnico(nomeTec, salarioTec, setor);
                    System.out.println("Técnico cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.println("\n--- Dados do Professor ---");
                    if (professor != null) {
                        professor.exibirInfo();
                    } else {
                        System.out.println("Nenhum professor cadastrado até o momento.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Dados do Técnico ---");
                    if (tecnico != null) {
                        tecnico.exibirInfo();
                    } else {
                        System.out.println("Nenhum técnico cadastrado até o momento.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}