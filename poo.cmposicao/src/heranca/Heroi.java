package heranca;

public class Heroi extends Jogador { //vai receber código a partir do mecanismo de herança.
    //o Heroi e um jogador.

    Heroi(int x, int y){
        super(x,y); //precisa chamar sempre que a classe pai nao tenho o const padrão definido.
    }


    boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 1) {
            oponente.vida -= 20;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 20;
            return true;
        } else {
            return false;
        }


        return true;
    }


}