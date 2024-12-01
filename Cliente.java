public class Cliente {
    String nome;
    String documento;
    String endereço;
    String email;

    public Cliente(String nome, String documento, String endereço, String email) {
        this.nome = nome;
        this.documento = documento;
        this.endereço = endereço;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", endereço='" + endereço + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
