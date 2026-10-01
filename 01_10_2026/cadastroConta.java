import java.util.ArrayList;

public class cadastroConta {
    private ArrayList<Conta> contas = new ArrayList<>();

    public void inserir(Conta conta) throws ExcecaoElementoJaExistente, ExcecaoRepositorio {
        if (contas.size() >= 100) {
            throw new ExcecaoRepositorio("Limite máximo de 100 contas atingido.");
        }

        for (Conta c : contas) {
            if (c.getNumero().equals(conta.getNumero())) {
                throw new ExcecaoElementoJaExistente("Já existe uma conta cadastrada com este número.");
            }
        }

        contas.add(conta);
    }

    public Conta buscar(String numero) throws ExcecaoElementoInexistente {
        for (Conta c : contas) {
            if (c.getNumero().equals(numero)) {
                return c;
            }
        }
        throw new ExcecaoElementoInexistente("Conta não encontrada.");
    }

    public void remover(String numero) throws ExcecaoElementoInexistente {
        Conta contaEncontrada = buscar(numero);
        contas.remove(contaEncontrada);
    }
}