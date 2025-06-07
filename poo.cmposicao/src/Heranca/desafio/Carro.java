package Heranca.desafio;

public class Carro {

    final double VELOCIDADE_MAXIMA;
    double velocidadeAtual;
    int delta = 5;

    //perdendo construtor padrão.
    Carro(double velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar(){
        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA){
            velocidadeAtual =VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += delta;
        }

    }

    void freiar(){
        if (velocidadeAtual >= 5){
            velocidadeAtual -= 5;
        }else {
            velocidadeAtual = 0;
        }
    }

    public String toString(){
        return "Velocidade Atual é " + velocidadeAtual;
    }


}
