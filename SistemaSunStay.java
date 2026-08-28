import java.util.Scanner;

public class SistemaSunStay {
    private static final int MAX_QUARTOS_HOTEL = 5;
    private static final int MAX_RESERVAS_TOTAL = 25;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalQuartos = 0;
        while (totalQuartos <= 0 || totalQuartos > MAX_QUARTOS_HOTEL) {
            System.out.print("Informe a quantidade de quartos disponíveis no hotel (máximo " + MAX_QUARTOS_HOTEL + "): ");
            if (scanner.hasNextInt()) {
                totalQuartos = scanner.nextInt();
                if (totalQuartos <= 0 || totalQuartos > MAX_QUARTOS_HOTEL) {
                    System.out.println("Quantidade inválida! O hotel pode possuir no máximo 5 quartos.");
                }
            } else {
                System.out.println("Por favor, informe um número inteiro válido.");
                scanner.next();
            }
        }
        scanner.nextLine();

        int[] numerosQuartos = new int[totalQuartos];
        int[] camasDisponiveis = new int[totalQuartos];
        boolean quartosCadastrados = false;
        boolean camasCadastradas = false;

        String[] hospedesReservas = new String[MAX_RESERVAS_TOTAL];
        int[] quartosReservados = new int[MAX_RESERVAS_TOTAL];
        int totalReservas = 0;

        int opcao = 0;
        do {
            System.out.println("\n=== GESTÃO DE RESERVAS - SUNSTAY ===");
            System.out.println("1 – Registrar número dos quartos");
            System.out.println("2 – Registrar quantidade de camas");
            System.out.println("3 – Reservar quarto");
            System.out.println("4 – Consultar reservas por quarto");
            System.out.println("5 – Consultar reservas por hóspede");
            System.out.println("6 – Encerrar sistema");
            System.out.print("Opção: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Opção inválida!");
                scanner.next();
                continue;
            }

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    for (int i = 0; i < totalQuartos; i++) {
                        System.out.print("Informe o número do Quarto " + (i + 1) + ": ");
                        numerosQuartos[i] = scanner.nextInt();
                    }
                    scanner.nextLine();
                    quartosCadastrados = true;
                    break;

                case 2:
                    if (!quartosCadastrados) {
                        System.out.println("Registre os quartos primeiro (Opção 1).");
                        break;
                    }
                    for (int i = 0; i < totalQuartos; i++) {
                        System.out.print("Quarto " + numerosQuartos[i] + " -> quantidade de camas: ");
                        camasDisponiveis[i] = scanner.nextInt();
                    }
                    scanner.nextLine();
                    camasCadastradas = true;
                    break;

                case 3:
                    if (!quartosCadastrados || !camasCadastradas) {
                        System.out.println("É necessário cadastrar os quartos e as camas primeiro.");
                        break;
                    }
                    if (totalReservas >= MAX_RESERVAS_TOTAL) {
                        System.out.println("Limite de reservas atingido!");
                        break;
                    }

                    System.out.print("Informe o número do quarto: ");
                    int numQuarto = scanner.nextInt();
                    scanner.nextLine();

                    int idxQuarto = -1;
                    for (int i = 0; i < totalQuartos; i++) {
                        if (numerosQuartos[i] == numQuarto) {
                            idxQuarto = i;
                            break;
                        }
                    }

                    if (idxQuarto == -1) {
                        System.out.println("Este quarto não existe!");
                    } else if (camasDisponiveis[idxQuarto] <= 0) {
                        System.out.println("Não há camas disponíveis neste quarto!");
                    } else {
                        System.out.print("Informe o nome do hóspede: ");
                        String nomeHospede = scanner.nextLine();

                        hospedesReservas[totalReservas] = nomeHospede;
                        quartosReservados[totalReservas] = numQuarto;
                        totalReservas++;
                        camasDisponiveis[idxQuarto]--;

                        System.out.println("Reserva realizada com sucesso!");
                    }
                    break;

                case 4:
                    if (!quartosCadastrados) {
                        System.out.println("Nenhum quarto cadastrado até o momento.");
                        break;
                    }
                    System.out.print("Informe o número do quarto: ");
                    int quartoConsulta = scanner.nextInt();
                    scanner.nextLine();

                    boolean existeQuarto = false;
                    for (int q : numerosQuartos) {
                        if (q == quartoConsulta) {
                            existeQuarto = true;
                            break;
                        }
                    }

                    if (!existeQuarto) {
                        System.out.println("Este quarto não existe!");
                    } else {
                        boolean temReserva = false;
                        for (int i = 0; i < totalReservas; i++) {
                            if (quartosReservados[i] == quartoConsulta) {
                                System.out.println("Hóspede: " + hospedesReservas[i]);
                                temReserva = true;
                            }
                        }
                        if (!temReserva) {
                            System.out.println("Não há reservas para este quarto!");
                        }
                    }
                    break;

                case 5:
                    System.out.print("Informe o nome do hóspede: ");
                    String nomeConsulta = scanner.nextLine();

                    boolean encontrouHospede = false;
                    for (int i = 0; i < totalReservas; i++) {
                        if (hospedesReservas[i].equalsIgnoreCase(nomeConsulta)) {
                            System.out.println("Reserva no Quarto: " + quartosReservados[i]);
                            encontrouHospede = true;
                        }
                    }
                    if (!encontrouHospede) {
                        System.out.println("Não há reservas para este hóspede!");
                    }
                    break;

                case 6:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 6);

        scanner.close();
    }
}