package com.company;

import javax.swing.*;
import java.util.Scanner;

public class EJERCICIO4 {

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        int entrada = 0;
        int cont = 0;
        int limite = 0;
        int mayor0 = 0;
        int menor0 = 0;
        int igual0 = 0;
        String tex = "";

        limite = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE LA CANTIDAD DE REPETICIONES"));


        while (cont < limite) {

            entrada = Integer.parseInt(JOptionPane.showInputDialog(null, " INGRESE  NUMEROS"));

            if (entrada > mayor0)
                mayor0 = mayor0 + 1;
            else if (entrada == igual0)
                igual0 = igual0 + 1;
            else
                menor0 = menor0 + 1;
            cont++;

        }

        if (mayor0 > 0)
            tex += mayor0 + " LOS MAYORES A CERO SON ";
        if (igual0 == 0)
            tex += igual0 + " LOS IGUALES A CERO SON ";


        if (menor0 < 0)
            tex += menor0 + " LOS MENORES A CERO SON ";

        JOptionPane.showMessageDialog(null, " NUMERO MAYORES" + mayor0 + "\nNUMEROS IGUALES" + igual0 + "\n MENORES " + menor0);

    }

}
