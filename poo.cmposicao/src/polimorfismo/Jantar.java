package polimorfismo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(99.65);
        System.out.println(convidado.getPeso());

        Alimento ingre1 = new Arroz(0.250);
        Feijao ingre2 = new Feijao(0.065);
        Sorvete ingre3 = new Sorvete(0.350);

        convidado.comer(ingre1);
        convidado.comer(ingre2);
        convidado.comer(ingre3);

        System.out.println(convidado.getPeso());




    }

}
