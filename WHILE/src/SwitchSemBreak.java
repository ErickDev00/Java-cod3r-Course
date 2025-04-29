public class SwitchSemBreak {
    public static void main(String[] args) {

        String faixa = "preta";
        //switch sem break executa todos os cases.
        switch (faixa.toLowerCase()){

            case "preta":
                System.out.println("Sei o Bassai-Dai");
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            default:
                System.out.println("Nao sei nada");
        }


    }

}
