public class Jantar {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Erick", 69.90);

        Comida c1 = new Comida("Arroz", 0.330);
        Comida c2 = new Comida("Feijão", 0.150);

        p1.Comer(p1, c1);

        p1.Comer(p1, c1, c2);


    }
}
