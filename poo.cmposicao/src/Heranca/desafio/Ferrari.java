package Heranca.desafio;

public class Ferrari extends Carro{

    Ferrari(){
        this(365);
    }

    Ferrari(double velocidadeMaxima){
        super(velocidadeMaxima);
        delta = 45;
    }


    //sobrescrevendo o métod
    @Override
    void acelerar() {
        velocidadeAtual += 15;
    }
}
