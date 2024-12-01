public class testeCartoes {
    public static void main(String[] args) {
        Cliente cli = new Cliente("Rodrigo Paulinelli",
                "777.555.616-15",
                "Rua Professor Antonio Aleixo,250, apto 1101, Lourdes",
                "rodrigo@mail.com");


       // Cartao credito = new CartaoCredito(100, 2000, cli, 50000,500);
        //credito.testeCartao();

        Cartao debito = new CartaoDebito(101,150000,cli,112255);

        Cartao PrePago = new CartaoPrePago(202,1500, cli,true,"Sodexo");




    }
}
