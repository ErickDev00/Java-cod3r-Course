public class AreaCirc {

    double raio;
    static final double pi = 3.14;
    //todo modificador de variavel vem antes do tipo.


    AreaCirc(double raioInicial){
        //se caso o valor de pi ser declarado aqui, sera um valor de instância podendo ser alterado.
        raio = raioInicial;
    }

    double area(){
        return pi * Math.pow(raio, 2);
    }
}
