public class DataTeste {
    public static void main(String[] args) {




        Data d1 = new Data();
        var d2 = new Data(31, 12, 2020);

        String dataFormatada1 = d1.obterDataFormatada();
        String dataFormatada2 = d2.obterDataFormatada();


        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();



    }
}
