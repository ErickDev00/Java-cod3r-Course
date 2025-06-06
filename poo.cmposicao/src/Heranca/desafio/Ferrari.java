package Heranca.desafio;

public class Ferrari extends Carro{
    //sobrescrevendo o métod
    @Override
    void acelerar() {
        velocidadeAtual += 15;
    }
}
