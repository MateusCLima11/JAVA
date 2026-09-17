import java.util.ArrayList;
import java.util.Scanner;

public class CadastroContatos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Contato> contatos = new ArrayList<>();

        while (true) {
            System.out.println("\n========= AGENDA DE CONTATOS =========");
            System.out.println("1 - Cadastrar contato pessoal");
            System.out.println("2 - Cadastrar contato profissional");
            System.out.println("3 - Cadastrar contato de emergência");
            System.out.println("4 - Listar todos os contatos");
            System.out.println("5 - Pesquisar contato");
            System.out.println("6 - Alterar contato");
            System.out.println("7 - Excluir contato");
            System.out.println("8 - Sair");
            System.out.print("Escolha uma opção: ");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    // Cadastra contato pessoal
                    System.out.print("Nome: ");
                    String nomeP = sc.nextLine();
                    System.out.print("Telefone: ");
                    String telP = sc.nextLine();
                    System.out.print("Parentesco: ");
                    String parentesco = sc.nextLine();

                    contatos.add(new ContatoPessoal(nomeP, telP, parentesco));
                    System.out.println("✅ Contato pessoal cadastrado com sucesso!");
                    break;

                case 2:
                    // Cadastra contato profissional
                    System.out.print("Nome: ");
                    String nomePr = sc.nextLine();
                    System.out.print("Telefone: ");
                    String telPr = sc.nextLine();
                    System.out.print("Empresa: ");
                    String empresa = sc.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = sc.nextLine();

                    contatos.add(new ContatoProfissional(nomePr, telPr, empresa, cargo));
                    System.out.println("✅ Contato profissional cadastrado com sucesso!");
                    break;

                case 3:
                    // Cadastra contato de emergência
                    System.out.print("Nome: ");
                    String nomeE = sc.nextLine();
                    System.out.print("Telefone: ");
                    String telE = sc.nextLine();
                    System.out.print("Prioridade (Alta/Média/Baixa): ");
                    String prioridade = sc.nextLine();

                    contatos.add(new ContatoEmergencia(nomeE, telE, prioridade));
                    System.out.println("✅ Contato de emergência cadastrado com sucesso!");
                    break;

                case 4:
                    // Lista os contatos
                    System.out.println("\n--- Lista de Contatos ---");
                    if (contatos.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado.");
                    } else {
                        for (int i = 0; i < contatos.size(); i++) {
                            System.out.println((i + 1) + " - " + contatos.get(i).exibirDados());
                            System.out.println("------------------------");
                        }
                    }
                    break;

                case 5:
                    // Pesquisa contato por nome
                    System.out.print("Digite o nome para pesquisar: ");
                    String busca = sc.nextLine();
                    boolean encontrado = false;

                    for (Contato c : contatos) {
                        if (c.getNome().equalsIgnoreCase(busca)) {
                            System.out.println("\nContato encontrado!");
                            System.out.println(c.exibirDados());
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 6:
                    // Altera Contato
                    if (contatos.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado.");
                    } else {
                        System.out.println("\nContatos cadastrados:");
                        for (int i = 0; i < contatos.size(); i++) {
                            System.out.println((i + 1) + " - " + contatos.get(i).getNome());
                        }

                        System.out.print("Informe o número do contato que deseja alterar: ");
                        int posAlterar = sc.nextInt();
                        sc.nextLine();

                        // Validação de posição
                        if (posAlterar >= 1 && posAlterar <= contatos.size()) {
                            Contato contato = contatos.get(posAlterar - 1);

                            System.out.print("Digite o novo nome: ");
                            String novoNome = sc.nextLine();
                            System.out.print("Digite o novo telefone: ");
                            String novoTel = sc.nextLine();

                            contato.setNome(novoNome);
                            contato.setNumero(novoTel);

                            System.out.println("Contato alterado com sucesso!");
                        } else {
                            System.out.println("Contato inválido!");
                        }
                    }
                    break;

                case 7:
                    // Deleta Contato
                    if (contatos.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado.");
                    } else {
                        System.out.println("\nContatos cadastrados:");
                        for (int i = 0; i < contatos.size(); i++) {
                            System.out.println((i + 1) + " - " + contatos.get(i).getNome());
                        }

                        System.out.print("Informe o número do contato que deseja excluir: ");
                        int posExcluir = sc.nextInt();
                        sc.nextLine();

                        if (posExcluir >= 1 && posExcluir <= contatos.size()) {
                            contatos.remove(posExcluir - 1);
                            System.out.println("✅ Contato excluído com sucesso!");
                        } else {
                            System.out.println("Contato inválido!");
                        }
                    }
                    break;

                case 8:
                    // Sair
                    System.out.println("Saindo do sistema... Até logo!");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}