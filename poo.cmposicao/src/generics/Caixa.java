package generics;

public class Caixa<TIPO> {

    //em generics os tipos sao definidos na hora de instanciar a classe
    private TIPO coisa;

    //set algo TIPO que ainda não foi definido
    public void guardar(TIPO coisa){
        this.coisa = coisa;
    };

    //pega "algo" que ainda não foi definido
    public TIPO abrir(){
        return coisa;
    }







}
