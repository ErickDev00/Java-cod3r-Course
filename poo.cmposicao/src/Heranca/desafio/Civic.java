package Heranca.desafio;

public class Civic extends Carro{
    public Civic(){
        this(212);
    }

    public Civic(double velocidadeMaxima){
        super(velocidadeMaxima);
        delta = 25;
    }


}
