import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("digite o primeiro numero");
        String valor2 = JOptionPane.showInputDialog("digite o primeiro numero");

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2;
        System.out.println("Soma é " + soma);
    }
}