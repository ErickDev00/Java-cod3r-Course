package Heranca.desafio;

public class Ferrari extends Carro{

    public Ferrari(){
        this(365);
    }

    public Ferrari(double velocidadeMaxima){
        super(velocidadeMaxima);
        delta = 45;
    }


    //sobrescrevendo o métod
    //@Override
    //public void acelerar() {
        //velocidadeAtual += 15;
    //}
}
