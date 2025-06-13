package encapsulamento.A;

public class Paulo {

    Ana esposa = new Ana();
    void testeAcesso(){

        //System.out.println(esposa.segredo); //private
        System.out.println(esposa.facoEmCasa); //default
        System.out.println(esposa.formaDeFalar); //protected
        System.out.println(esposa.todosSabem); //public

    }


}
