public class Motor {
    Carro carro;

    //variaveis de classe
    double fatorInjecao = 1;
    boolean desligado = true;

    //construtores
    Motor(Carro carro){ //para construir o motor recebe-se o objeto Carro como parâmetro.
        this.carro = carro;
    }

    Motor(){
    }

    //métodos
    int giros(){
        if (desligado){
            return 0;
        } else {
            return (int) Math.round(fatorInjecao * 3000);
        }
    }






}