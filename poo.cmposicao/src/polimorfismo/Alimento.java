package polimorfismo;

public class Alimento {

    private double peso;

    public Alimento(double peso){
        setPeso(peso);
    }

    //le
    public double getPeso() {
        return peso;
    }

    //escreve
    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        } else {
            System.out.println("peso inválido");
        }
    }


}
