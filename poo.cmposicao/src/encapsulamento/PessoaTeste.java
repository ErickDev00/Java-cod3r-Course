package encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(30);
        p1.setIdade(45); //alterando


        System.out.println(p1.getIdade()); //lendo
    }

}
