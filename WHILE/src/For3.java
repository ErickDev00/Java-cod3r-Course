public class For3 {

    public static void main(String[] args) {
        int i = 0;
        for (; i < 10; i++){
            System.out.println(i);
        }

        System.out.println("Saiu do for..");
        System.out.println(i);
        //nao pode usar a variavel antes de declara-la.


        for (int e = 0; e < 10; e++){
            for (int j = 0; j < 10; j++){
                System.out.printf("[%d %d]", e, j);
            }
        }

    }

}
