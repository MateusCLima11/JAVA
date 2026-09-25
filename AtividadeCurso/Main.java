package AtividadeCurso;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Curso curso = null;
        String nomeAluno = "";
        double valorMatriculaPago = 0.0;
        boolean matriculaEfetuada = false;

        while (true) {
            System.out.println("\n========== SISTEMA DE CURSOS ==========");
            System.out.println("1. Cadastrar Curso (Presencial/Online)");
            System.out.println("2. Cadastrar Nome do Aluno");
            System.out.println("3. Realizar Matrícula");
            System.out.println("4. Realizar Matrícula com Desconto");
            System.out.println("5. Mostrar Dados do Curso");
            System.out.println("6. Mostrar Dados da Matrícula");
            System.out.println("7. Encerrar o Programa");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- CADASTRAR CURSO ---");
                    System.out.println("1 - Curso Presencial");
                    System.out.println("2 - Curso Online");
                    System.out.print("Escolha a modalidade: ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Código: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome do Curso: ");
                    String nomeCurso = scanner.nextLine();

                    System.out.print("Carga Horária (horas): ");
                    int carga = scanner.nextInt();

                    System.out.print("Valor (R$): ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();

                    if (tipo == 1) {
                        System.out.print("Nome da Sala: ");
                        String sala = scanner.nextLine();
                        System.out.print("Turno: ");
                        String turno = scanner.nextLine();

                        curso = new CursoPresencial(codigo, nomeCurso, carga, valor, sala, turno);
                        System.out.println("Curso Presencial cadastrado com sucesso!");
                    } else if (tipo == 2) {
                        System.out.print("Endereço da Plataforma: ");
                        String plataforma = scanner.nextLine();
                        System.out.print("Código de Acesso: ");
                        String codigoAcesso = scanner.nextLine();

                        curso = new CursoOnline(codigo, nomeCurso, carga, valor, plataforma, codigoAcesso);
                        System.out.println("Curso Online cadastrado com sucesso!");
                    } else {
                        System.out.println("Opção de modalidade inválida.");
                    }
                    break;

                case 2:
                    System.out.print("\nDigite o nome do aluno: ");
                    nomeAluno = scanner.nextLine();
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                case 3:
                    if (curso == null) {
                        System.out.println("Cadastre um curso antes de realizar a matrícula.");
                    } else if (nomeAluno.trim().isEmpty()) {
                        System.out.println("Cadastre o nome do aluno antes de realizar a matrícula.");
                    } else {
                        valorMatriculaPago = curso.realizarMatricula();
                        matriculaEfetuada = true;
                        System.out.printf("Matrícula realizada para %s! Valor final: R$ %.2f%n", nomeAluno, valorMatriculaPago);
                    }
                    break;

                case 4:
                    if (curso == null) {
                        System.out.println("Cadastre um curso antes de realizar a matrícula.");
                    } else if (nomeAluno.trim().isEmpty()) {
                        System.out.println("Cadastre o nome do aluno antes de realizar a matrícula.");
                    } else {
                        System.out.print("Informe o percentual de desconto (%): ");
                        double desconto = scanner.nextDouble();
                        scanner.nextLine();

                        valorMatriculaPago = curso.realizarMatricula(desconto);
                        matriculaEfetuada = true;
                        System.out.printf("Matrícula com desconto de %.1f%% realizada para %s! Valor final: R$ %.2f%n", desconto, nomeAluno, valorMatriculaPago);
                    }
                    break;

                case 5:
                    if (curso == null) {
                        System.out.println("Nenhum curso cadastrado.");
                    } else {
                        System.out.println("\n--- DADOS DO CURSO ---");
                        curso.exibirDados();
                    }
                    break;

                case 6:
                    if (!matriculaEfetuada) {
                        System.out.println("Nenhuma matrícula foi realizada ainda.");
                    } else {
                        System.out.println("\n--- DADOS DA MATRÍCULA ---");
                        System.out.println("Aluno: " + nomeAluno);
                        System.out.println("Curso: " + curso.getNome());
                        System.out.printf("Valor Pago: R$ %.2f%n", valorMatriculaPago);
                    }
                    break;

                case 7:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}