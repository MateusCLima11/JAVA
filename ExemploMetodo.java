public class ExemploMetodo {

//sem parametro e sem retorno
    public static void mensagem() {
        System.out.println("Seja bem vindo");
    }

//com parametro e sem retorno
    public static void mostrarNome(String nome) {
        System.out.println("nome: "+nome);
    }

//sem parametro e com retorno
    public  static  int obterNumeto(){
        return  10;
    }


//com parametro e com retorno
public  static  int somar(int n1, int n2){
    return  n1+n2;
}

    public static void main(String[] args) {
        mensagem();
        mostrarNome("carlos");
        int numero=obterNumeto();
        System.out.println("Numero: "+numero);
        int resultado=somar(10,5);
        System.out.println("soma:"+resultado);
    }


}