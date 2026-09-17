public class Cliente extends Pessoa implements Pagamento {

    public Cliente(String nome){
        super(nome);
    }

    @Override
    public void pagar(double valor){
        System.out.println("Pagamento realizad: R$" +valor);
    }

    public void comprar(String produto){
        System.out.println("Produto comprado" +produto);
    }

    public void comprar(String produto, int quantidade){
        System.out.println("Produto comprado: " +produto);
        System.out.println("Quantidade: " +quantidade);
    }

    public void comprar(String produto, int quantidade, double valor){
        System.out.println("Produto comprado: " +produto);
        System.out.println("Quantidade:" +quantidade);
        System.out.println("Valor unitario:" +valor);
        System.out.println("Total: R$" +(quantidade*valor));
    }
    
    
}
