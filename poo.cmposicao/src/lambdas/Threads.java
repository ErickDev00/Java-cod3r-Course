package lambdas;

public class Threads {
    public static void main(String[] args) {

        Runnable trabalho2 = new Runnable() {

            @Override
            public void run() {
                for (int i=0; i<100; i++){
                    System.out.println("teste");
                }

            }
        };

        Runnable trabalho3 = () -> {
            for (int i=0; i<100; i++){
                System.out.println("teste3");
            }
        };



        //new Thread(trabalho2);
        Thread t1 = new Thread(trabalho2);
        t1.start();

        Thread t3 = new Thread(trabalho3);
        t3.start();














    }
}
