public class ValorNulo {

    public static void main(String[] args) {

        String s1 = "";
        System.out.println(s1.concat("!!!!"));

        Data d1 = Math.random() > 0.5 ? new Data() : null;
        if (d1 != null){
            d1.mes = 3;
            System.out.println(d1.obterDataFormatada());
        };

        String s2 = Math.random() > 0.5 ? "Opa" : null;
        //se ela somente estiver vazia não ira funcionar.
        // nao se pode acessar nem atributo e nem método de algo que está nulo.
        if (s2 != null){
            System.out.println(s2.concat("????"));
        }

    }
}
