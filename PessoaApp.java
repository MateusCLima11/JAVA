public class PessoaApp {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Edivandecidecleide");
        Pessoa p2 = new Pessoa(2, "Carla");

        //acessador
        System.out.println("Pessoa: "+p1.getCodigo()+"nome"+p1.getNome());

        //modificador
        p1.setNome("Vanessa");

        System.out.println("Pessoa: "+p2.getCodigo()+"nome"+p2.getNome());
    }
}