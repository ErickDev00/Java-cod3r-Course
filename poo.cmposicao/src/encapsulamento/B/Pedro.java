package encapsulamento.B;

import encapsulamento.A.Ana;

public class Pedro extends Ana {

    //Ana mae = new Ana();

    void testeAcesso(){

        //System.out.println(esposa.segredo); //private
        //System.out.println(mae.facoEmCasa); //default (somente dentro pacote)
        System.out.println(formaDeFalar); //protected
        System.out.println(todosSabem); //public

        //forma de falar e todos sabem, são acessados diretamente porque são recebidos por herança.
    }


}
