public class ValorVsReferencia {

    public static void main(String[] args) {
        //atribuicao por valor, dois valores independentes (Tipo primitivo).
        double a = 2;
        double b = a;
        a++;
        b--;

        System.out.println(a);
        System.out.println(b);

        //exemplo de atribuicao por referência (objeto).
        Data d4 = new Data(1, 06, 2020);
        Data d5 = d4;

        d4.dia = 31;
        d5.mes = 02;

        System.out.println(d4.obterDataFormatada());
        System.out.println(d5.obterDataFormatada());

        voltarParaValorPadrao(d4);
        System.out.println(d4.obterDataFormatada());


        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);


    }

    //evitar
    static void voltarParaValorPadrao(Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    //o que é modificado abaixo não gera impacto algum
    static void alterarPrimitivo(int a){
        a++;
    }

}
