package generics;

public class CaixaObjetoTeste {
    public static void main(String[] args) {
        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.guardar(2.3); //double

        //Integer coisa = (Integer) caixaA.abrir(); //int, da erro.
        //System.out.println(coisa);

        Double coisa = (Double) caixaA.abrir(); //int, da erro.
        System.out.println(coisa);
    }

}
