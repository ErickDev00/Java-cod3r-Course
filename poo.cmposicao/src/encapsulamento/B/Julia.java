package encapsulamento.B;

import encapsulamento.A.Ana;

public class Julia {

    Ana amiga = new Ana();

    void testeAcesso(){

        //System.out.println(esposa.segredo); //private
        //System.out.println(amiga.facoEmCasa); //default
        //System.out.println(amiga.formaDeFalar); //protected
        System.out.println(amiga.todosSabem); //public

    }
}
