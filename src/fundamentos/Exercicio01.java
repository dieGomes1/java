package fundamentos;

import javax.swing.*;

public class Exercicio01 {

    public static void main(String[] args) {
       String temperaturaCelsius = JOptionPane.showInputDialog("Informe a temperatura em graus Celsius");

       int temp = Integer.parseInt(temperaturaCelsius);

       int converteTemperatura = (temp*9/5) + 32;

        System.out.println("temperatura em Celsius: " +temp + "\ntemperatura em fahrenheit: " +converteTemperatura);
    }
}
