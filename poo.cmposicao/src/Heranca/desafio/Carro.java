package Heranca.desafio;

public class Carro {

    double velocidadeAtual;

    void acelerar(){
        velocidadeAtual += 5;
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
