import java.util.Scanner;

public class SistemaEstoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];
        int[] quantidades = new int[5];
        
        int qtd = 0;
        int opcao = -1;

        while (opcao != 6) {
            System.out.println("\n--- GERENCIAMENTO DE ESTOQUE ---");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Pesquisar produto");
            System.out.println("4 - Alterar produto");
            System.out.println("5 - Remover produto");
            System.out.println("6 - Sair do sistema");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (qtd >= 5) {
                        System.out.println("\nErro: Limite máximo de 5 produtos atingido!");
                    } else {
                        System.out.print("Digite o nome do produto: ");
                        nomes[qtd] = sc.nextLine();

                        System.out.print("Digite a quantidade em estoque: ");
                        quantidades[qtd] = sc.nextInt();
                        sc.nextLine();

                        qtd++;
                        System.out.println("Produto cadastrado com sucesso!");
                    }
                    break;

                case 2:
                    if (qtd == 0) {
                        System.out.println("\nNenhum produto cadastrado no momento.");
                    } else {
                        System.out.println("\n--- LISTA DE PRODUTOS ---");
                        for (int i = 0; i < qtd; i++) {
                            System.out.println("Índice [" + i + "] - Nome: " + nomes[i] + " | Quantidade: " + quantidades[i]);
                        }
                    }
                    break;

                case 3:
                    if (qtd == 0) {
                        System.out.println("\nNenhum produto cadastrado para pesquisar.");
                    } else {
                        System.out.print("Digite o nome do produto para pesquisar: ");
                        String busca = sc.nextLine();
                        int indiceEncontrado = -1;

                        for (int i = 0; i < qtd; i++) {
                            if (nomes[i].equalsIgnoreCase(busca)) {
                                indiceEncontrado = i;
                                break;
                            }
                        }

                        if (indiceEncontrado != -1) {
                            System.out.println("\nProduto encontrado!");
                            System.out.println("Índice [" + indiceEncontrado + "] - Nome: " + nomes[indiceEncontrado] + " | Quantidade: " + quantidades[indiceEncontrado]);
                        } else {
                            System.out.println("Produto não encontrado.");
                        }
                    }
                    break;

                case 4:
                    if (qtd == 0) {
                        System.out.println("\nNenhum produto cadastrado para alterar.");
                    } else {
                        System.out.print("Digite o nome do produto que deseja alterar: ");
                        String buscaAlterar = sc.nextLine();
                        int indiceAlterar = -1;

                        for (int i = 0; i < qtd; i++) {
                            if (nomes[i].equalsIgnoreCase(buscaAlterar)) {
                                indiceAlterar = i;
                                break;
                            }
                        }

                        if (indiceAlterar != -1) {
                            System.out.print("Digite o novo nome do produto: ");
                            nomes[indiceAlterar] = sc.nextLine();

                            System.out.print("Digite a nova quantidade em estoque: ");
                            quantidades[indiceAlterar] = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Produto alterado com sucesso!");
                        } else {
                            System.out.println("Produto não encontrado.");
                        }
                    }
                    break;

                case 5:
                    if (qtd == 0) {
                        System.out.println("\nNenhum produto cadastrado para remover.");
                    } else {
                        System.out.print("Digite o nome do produto que deseja remover: ");
                        String buscaRemover = sc.nextLine();
                        int indiceRemover = -1;

                        for (int i = 0; i < qtd; i++) {
                            if (nomes[i].equalsIgnoreCase(buscaRemover)) {
                                indiceRemover = i;
                                break;
                            }
                        }

                        if (indiceRemover != -1) {
                            for (int j = indiceRemover; j < qtd - 1; j++) {
                                nomes[j] = nomes[j + 1];
                                quantidades[j] = quantidades[j + 1];
                            }

                            nomes[qtd - 1] = null;
                            quantidades[qtd - 1] = 0;

                            qtd--;
                            System.out.println("Produto removido com sucesso!");
                        } else {
                            System.out.println("Produto não encontrado.");
                        }
                    }
                    break;

                case 6:
                    System.out.println("\nEncerrando o sistema...");
                    break;

                default:
                    System.out.println("\nOpção inválida! Escolha um número entre 1 e 6.");
                    break;
            }
        }

        sc.close();
    }
}