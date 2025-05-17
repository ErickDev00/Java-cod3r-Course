public class Data {
    //atributos
    Integer dia;
    Integer mes;
    Integer ano;

    Data(){
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data(Integer diaInicial, Integer mesInicial, Integer anoInicial){
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }

    //formatando a data para string (metodo)
    String obterDataFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }


    //imprimindo a data com sout metodo (menos recomendado)
    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }
}
