import java.util.Scanner;

public class SweetFlight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeroAvioes = new int[4];
        int[] assentosAvioes = new int[4];
        String[] nomePassageiros = new String[20];
        int[] aviaoReservas = new int[20];

        // Controle de quantidades atuais
        int totalAvioes = 0;
        int totalReservas = 0;
        boolean assentosCadastrados = false;

        int opcao = 0;

        while (opcao != 8) {
            System.out.println("=========================================");
            System.out.println("      SWEET FLIGHT – SISTEMA DE RESERVAS");
            System.out.println("=========================================");
            System.out.println("1 - Cadastrar aviões");
            System.out.println("2 - Cadastrar quantidade de assentos");
            System.out.println("3 - Listar aviões");
            System.out.println("4 - Realizar reserva");
            System.out.println("5 - Consultar reservas de um avião");
            System.out.println("6 - Pesquisar passageiro");
            System.out.println("7 - Mostrar resumo");
            System.out.println("8 - Sair");
            System.out.println();
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao < 1 || opcao > 8) {
                System.out.println("Opção inválida!\n");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Informe a quantidade de aviões a cadastrar (1 a 4): ");
                    int qtdCadastrar = scanner.nextInt();
                    scanner.nextLine();

                    while (qtdCadastrar < 1 || qtdCadastrar > 4) {
                        System.out.print("Quantidade inválida! Informe um valor entre 1 e 4: ");
                        qtdCadastrar = scanner.nextInt();
                        scanner.nextLine();
                    }

                    totalAvioes = qtdCadastrar;

                    for (int i = 0; i < totalAvioes; i++) {
                        boolean numeroValido = false;
                        while (!numeroValido) {
                            System.out.print("Informe o número do " + (i + 1) + "º avião: ");
                            int numAviao = scanner.nextInt();
                            scanner.nextLine();

                            boolean existe = false;
                            for (int j = 0; j < i; j++) {
                                if (numeroAvioes[j] == numAviao) {
                                    existe = true;
                                    break;
                                }
                            }

                            if (existe) {
                                System.out.println("Erro: Já existe um avião cadastrado com esse número. Tente outro.");
                            } else {
                                numeroAvioes[i] = numAviao;
                                numeroValido = true;
                            }
                        }
                    }

                    assentosCadastrados = false;
                    System.out.println("Aviões cadastrados com sucesso!\n");
                    break;

                case 2:
                    if (totalAvioes == 0) {
                        System.out.println("Nenhum avião cadastrado. Realize o cadastro de aviões primeiro.\n");
                        break;
                    }

                    for (int i = 0; i < totalAvioes; i++) {
                        System.out.print("Informe a quantidade de assentos (0 a 20) para o avião " + numeroAvioes[i] + ": ");
                        int qtdAssentos = scanner.nextInt();
                        scanner.nextLine();

                        while (qtdAssentos < 0 || qtdAssentos > 20) {
                            System.out.print("Quantidade inválida! Informe um valor de 0 a 20: ");
                            qtdAssentos = scanner.nextInt();
                            scanner.nextLine();
                        }

                        assentosAvioes[i] = qtdAssentos;
                    }

                    assentosCadastrados = true;
                    System.out.println("Assentos cadastrados com sucesso!\n");
                    break;

                case 3:
                    if (totalAvioes == 0) {
                        System.out.println("Nenhum avião cadastrado.\n");
                    } else {
                        System.out.println("\n--- LISTA DE AVIÕES ---");
                        for (int i = 0; i < totalAvioes; i++) {
                            System.out.println("Avião: " + numeroAvioes[i] + " | Assentos disponíveis: " + assentosAvioes[i]);
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    if (totalAvioes == 0 || !assentosCadastrados) {
                        System.out.println("É necessário cadastrar aviões e seus assentos antes de realizar reservas.\n");
                        break;
                    }

                    if (totalReservas >= 20) {
                        System.out.println("Limite de 20 reservas já foi atingido!\n");
                        break;
                    }

                    System.out.print("Informe o número do avião desejado: ");
                    int numAviaoReserva = scanner.nextInt();
                    scanner.nextLine();

                    int indiceAviao = -1;
                    for (int i = 0; i < totalAvioes; i++) {
                        if (numeroAvioes[i] == numAviaoReserva) {
                            indiceAviao = i;
                            break;
                        }
                    }

                    if (indiceAviao == -1) {
                        System.out.println("Este avião não existe!\n");
                    } else if (assentosAvioes[indiceAviao] <= 0) {
                        System.out.println("Não há assentos disponíveis para este avião!\n");
                    } else {
                        System.out.print("Informe o nome do passageiro: ");
                        String nomePassageiro = scanner.nextLine();

                        while (nomePassageiro.equals("")) {
                            System.out.print("O nome não pode ficar vazio. Informe o nome do passageiro: ");
                            nomePassageiro = scanner.nextLine();
                        }

                        nomePassageiros[totalReservas] = nomePassageiro;
                        aviaoReservas[totalReservas] = numAviaoReserva;
                        assentosAvioes[indiceAviao]--;
                        totalReservas++;

                        System.out.println("Reserva realizada com sucesso!\n");
                    }
                    break;

                case 5:
                    if (totalAvioes == 0) {
                        System.out.println("Nenhum avião cadastrado.\n");
                        break;
                    }

                    System.out.print("Informe o número do avião para consulta: ");
                    int numConsultaAviao = scanner.nextInt();
                    scanner.nextLine();

                    boolean aviaoExiste = false;
                    for (int i = 0; i < totalAvioes; i++) {
                        if (numeroAvioes[i] == numConsultaAviao) {
                            aviaoExiste = true;
                            break;
                        }
                    }

                    if (!aviaoExiste) {
                        System.out.println("Este avião não existe!\n");
                    } else {
                        boolean encontrouReserva = false;
                        System.out.println("\nPassageiros do avião " + numConsultaAviao + ":");
                        for (int i = 0; i < totalReservas; i++) {
                            if (aviaoReservas[i] == numConsultaAviao) {
                                System.out.println("- " + nomePassageiros[i]);
                                encontrouReserva = true;
                            }
                        }

                        if (!encontrouReserva) {
                            System.out.println("Não há reservas realizadas para este avião!");
                        }
                        System.out.println();
                    }
                    break;

                case 6:
                    System.out.print("Informe o nome do passageiro para pesquisa: ");
                    String nomePesquisa = scanner.nextLine();

                    boolean passageiroEncontrado = false;
                    System.out.println("\nReservas de " + nomePesquisa + ":");

                    for (int i = 0; i < totalReservas; i++) {
                        if (nomePassageiros[i].equalsIgnoreCase(nomePesquisa)) {
                            System.out.println("- Avião: " + aviaoReservas[i]);
                            passageiroEncontrado = true;
                        }
                    }

                    if (!passageiroEncontrado) {
                        System.out.println("Não há reservas realizadas para este passageiro!");
                    }
                    System.out.println();
                    break;

                case 7:
                    System.out.println("\n================ RESUMO DO SISTEMA ================");
                    System.out.println("Quantidade de aviões cadastrados: " + totalAvioes);
                    System.out.println("Quantidade total de reservas realizadas: " + totalReservas);

                    int totalAssentosDisponiveis = 0;
                    int avioesComAssentos = 0;
                    int avioesSemAssentos = 0;
                    int aviaoMaiorAssentos = -1;
                    int maxAssentos = -1;

                    for (int i = 0; i < totalAvioes; i++) {
                        totalAssentosDisponiveis += assentosAvioes[i];

                        if (assentosAvioes[i] > 0) {
                            avioesComAssentos++;
                        } else {
                            avioesSemAssentos++;
                        }

                        if (assentosAvioes[i] > maxAssentos) {
                            maxAssentos = assentosAvioes[i];
                            aviaoMaiorAssentos = numeroAvioes[i];
                        }
                    }

                    System.out.println("Quantidade total de assentos disponíveis: " + totalAssentosDisponiveis);
                    System.out.println("Quantidade de aviões com assentos disponíveis: " + avioesComAssentos);
                    System.out.println("Quantidade de aviões sem assentos disponíveis: " + avioesSemAssentos);

                    if (totalAvioes > 0) {
                        System.out.println("Avião com maior quantidade de assentos disponíveis: " + aviaoMaiorAssentos + " (" + maxAssentos + " assentos)");
                    } else {
                        System.out.println("Avião com maior quantidade de assentos disponíveis: N/A");
                    }
                    System.out.println();
                    break;

                case 8:
                    System.out.println("Sistema encerrado. Até logo!");
                    break;
            }
        }

        scanner.close();
    }
}