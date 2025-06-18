package heranca.desafio;

public class Ferrari extends Carro implements Esportivo{

    public Ferrari(){
        this(365);
    }

    public Ferrari(double velocidadeMaxima){
        super(velocidadeMaxima);
        delta = 45;
    }

    @Override
    public void ligarTurbo(){
        delta = 35;
    }

    @Override
    public void desligarTurbo() {
        delta = 45;
    }

    //sobrescrevendo o métod
    //@Override
    //public void acelerar() {
        //velocidadeAtual += 15;
    //}
}
