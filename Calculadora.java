import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número (OPERANDO1): ");
        double operando1 = sc.nextDouble();

        System.out.println("Digite o segundo número (OPERANDO2): ");
        double operando2 = sc.nextDouble();

        System.out.println("Digite a operação (+, -, *, /): ");
        char operador = sc.next().charAt(0);

        double resultado = 0;
        boolean operacaoValida = true;

        switch (operador) {
            case '+':
                resultado = operando1 + operando2;
                break;
            case '-':
                resultado = operando1 - operando2;
                break;
            case '*':
                resultado = operando1 * operando2;
                break;
            case '/':
                if (operando2 != 0) {
                    resultado = operando1 / operando2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operador inválido!");
                operacaoValida = false;
                break;
        }

        if (operacaoValida) {
            System.out.println("RESULTADO: " + resultado);
        }

        sc.close();
    }
}