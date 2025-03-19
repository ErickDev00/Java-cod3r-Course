public class Main {
    public static void main(String[] args) {
        final double Fator = 5.0 / 9.0;
        final double Ajuste = 32;

        double fahrenheit = 86;
        double celsius = (fahrenheit - Ajuste) * Fator;

        System.out.println(celsius);
    }
}