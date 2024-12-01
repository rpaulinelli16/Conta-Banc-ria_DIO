public class CartaoDebito extends Cartao {
    ContaBancaria nunConta;

    public CartaoDebito(int numCartao, double saldo, Cliente titular, ContaBancaria nunConta) {
        super(numCartao, saldo, titular);
        this.nunConta= nunConta;
    }
}
