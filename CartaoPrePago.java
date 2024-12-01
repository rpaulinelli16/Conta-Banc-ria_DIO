public class CartaoPrePago extends Cartao{
    boolean cartaoAtivo;

    public CartaoPrePago(int numCartao, double saldo, Cliente titular, boolean cartaoAtivo, Empresa empresa) {
        super(numCartao, saldo, titular);
        this.cartaoAtivo = cartaoAtivo;
        this.empresa = empresa;
    }

    Empresa empresa;

}
