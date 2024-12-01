public class CartaoCredito extends Cartao{
   public double limite;
    public double anuidade;

    public CartaoCredito(int numCartao, double saldo, Cliente titular, double limite, double anuidade) {
        super(numCartao, saldo, titular);
        this.limite = limite;
        this.anuidade = anuidade;
    }

    @Override
    public String toString() {
        return "CartaoCredito{" +
                "limite=" + limite +
                ", anuidade=" + anuidade +
                '}';
    }
}
