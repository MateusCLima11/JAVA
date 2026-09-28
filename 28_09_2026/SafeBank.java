import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 100.0;

        try{
            System.out.println("Quanto voce quer sacar? R$ ");
            double valorSaque = scanner.nextDouble();

            if (valorSaque <=  0) {
                System.out.println("valor invalido!");
            }else if (valorSaque > saldo) {
                System.out.println("Saldo insuficiente!");
            }else{
                saldo = saldo - valorSaque;
                System.out.println("Saque realizado");
                System.out.println("Novo saldo: R$ "+ saldo);
            }
        }catch(InputMismatchException e){
            System.out.println("Erro: Digite um numero!");
        }catch(Exception e){
            System.out.println("Ocorreu um erro inesperado: "+e.getMessage());
        }
        finally{
            System.out.println("Operação encerrada");
            scanner.close();
        }
    }
}