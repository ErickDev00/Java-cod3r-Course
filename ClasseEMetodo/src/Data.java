public class Data {
    Integer dia;
    Integer mes;
    Integer ano;

    //formatando a data para string
    String obterDataFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }


    //imprimindo a data com sout (menos recomendado)
    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }
}
