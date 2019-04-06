package fundamentos;

import javax.swing.*;

public class ConversorStringNumero {
    public static void main(String[]args){
        String resposta1 = JOptionPane.showInputDialog("Qual a primeira nota");
        String resposta2 = JOptionPane.showInputDialog("Qual a segunda nota");


        System.out.println(resposta1 + resposta2);

        double nota1 = Double.parseDouble(resposta1);
        double nota2 = Double.parseDouble(resposta2);

        System.out.println(nota1 + nota2);
    }
}
