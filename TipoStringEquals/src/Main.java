public class Main {
    public static void main(String[] args) {
        System.out.println("2" == "2"); //true

        String s = new String("2");
        System.out.println("2" == s); //false

        System.out.println("2".equals(s)); //true compara os conteúdos

    }
}