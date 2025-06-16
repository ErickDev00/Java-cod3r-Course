package encapsulamento.A;

public class Paulo {

    Ana esposa = new Ana();
    void testeAcesso(){

        //System.out.println(esposa.segredo); //private - somente dentro da própria classe
        System.out.println(esposa.facoEmCasa); //default - mesmo pacote
        System.out.println(esposa.formaDeFalar); //protected - mesmo pacote
        System.out.println(esposa.todosSabem); //public

    }


}
