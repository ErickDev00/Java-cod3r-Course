package Heranca;

public class Heroi extends Jogador { //vai receber código a partir do mecanismo de herança.
    //o Heroi e um jogador.


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