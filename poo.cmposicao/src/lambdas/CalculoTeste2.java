package lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {


        Calculo soma = (x, y) -> {return x + y;};
        System.out.println(soma.executar(2, 3));

        //para multiplicar
        Calculo multiplicar = (x,y) -> {return x * y;};
        System.out.println(multiplicar.executar(5,3));




    }
}
