import java.util.ArrayList;

public class Ex01 {

    public static void main(String[] args) {
        
        ArrayList<String> nomes = new ArrayList<>();

        // Adicionar
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Marcos");

        // Listar
        System.out.println("===== Lista =====");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Alterar
        nomes.set(1, "Cleide");

        System.out.println("===== Lista após alterar =====");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Remover
        nomes.remove(1); // Remove pelo índice (posição 1)
        // nomes.remove("Ana"); // Alternativa: remove diretamente pelo valor/nome

        System.out.println("===== Lista após remover =====");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}