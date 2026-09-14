import java.util.ArrayList;
import java.util.Scanner;

public class CadastroContatos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contato> contatos = new ArrayList<>();

        while (true) {
            System.out.println("<<<<<<<SDCC>>>>>>>");
            System.out.println("1-Cadastrar Contato");
            System.out.println("2-Listar Contato");
            System.out.println("3-Excluir Contato");
            System.out.println("4-Alterar Contato");
            System.out.println("5-Pesquisar Contato");
            System.out.println("6-Sair");
            System.out.println("Opção: ");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o número: ");
                    String numero = sc.nextLine();

                    contatos.add(new Contato(nome, numero));
                    System.out.println("Contato cadastrado com sucesso!\n");
                    break;

                case 2:
                    System.out.println("Nomes cadastrados");
                    for (int i = 0; i < contatos.size(); i++) {
                        System.out.println((i + 1) + " - " + contatos.get(i));
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Digite o nome do contato que deseja excluir: ");
                    String nomeExcluir = sc.nextLine();
                    boolean excluido = false;

                    for (int i = 0; i < contatos.size(); i++) {
                        if (contatos.get(i).getNome().equalsIgnoreCase(nomeExcluir)) {
                            contatos.remove(i);
                            System.out.println("Contato excluído com sucesso!\n");
                            excluido = true;
                            break;
                        }
                    }

                    if (!excluido) {
                        System.out.println("Contato não encontrado.\n");
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome do contato que deseja alterar: ");
                    String nomeAlterar = sc.nextLine();
                    boolean alterado = false;

                    for (Contato c : contatos) {
                        if (c.getNome().equalsIgnoreCase(nomeAlterar)) {
                            System.out.print("Digite o novo nome: ");
                            String novoNome = sc.nextLine();
                            System.out.print("Digite o novo número: ");
                            String novoNumero = sc.nextLine();

                            c.setNome(novoNome);
                            c.setNumero(novoNumero);

                            System.out.println("Contato alterado com sucesso!\n");
                            alterado = true;
                            break;
                        }
                    }

                    if (!alterado) {
                        System.out.println("Contato não encontrado.\n");
                    }
                    break;

                case 5:
                    System.out.print("Digite o nome do contato que deseja pesquisar: ");
                    String nomePesquisa = sc.nextLine();
                    boolean encontrado = false;

                    for (Contato c : contatos) {
                        if (c.getNome().equalsIgnoreCase(nomePesquisa)) {
                            System.out.println("Contato encontrado: " + c + "\n");
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Contato não encontrado.\n");
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida!\n");
                    break;
            }
        }
    }
}