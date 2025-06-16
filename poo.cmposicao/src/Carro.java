public class Carro {

    Motor motor; // Cada carro possui exatamente um motor.

    Carro(){

        this.motor = new Motor(this);
    }

    void acelerar(){
        if (motor.fatorInjecao < 2.6){
            motor.fatorInjecao += 0.4;
        }
    }

    void frear(){
        if (motor.fatorInjecao > 0.5) {
            motor.fatorInjecao -= 0.4;
        }
    };

    void ligar() {
        motor.desligado = false;
    }

    void desligar(){
        motor.desligado = true;
    }

    boolean estaDesligado(){
        return motor.desligado;
    }








}
