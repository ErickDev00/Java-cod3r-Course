package heranca;

public class Jogo {
    public static void main(String[] args) {

        Jogador j1 = new Jogador(10,10);

        Jogador j2 = new Jogador(10,11);

        Heroi heroi = new Heroi(10,11);

        System.out.println(j1.vida);
        System.out.println(j2.vida);

        j1.atacar(j2);

        System.out.println(j1.vida);
        System.out.println(j2.vida);

    }
}
