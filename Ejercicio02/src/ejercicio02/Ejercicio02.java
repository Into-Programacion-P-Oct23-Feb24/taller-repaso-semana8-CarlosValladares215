/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int contador;
        int n;
        System.out.println("Ingrese un numero");
        n = entrada.nextInt();

        if (n > 0 && n % 2 == 0) {
            contador = n;
            n = n - n;
            while (n < contador) {
                n = n + 1;
                System.out.printf("%d \n", n);
            }
        } else {
            System.out.println("Error, el numero ingresado debe ser "
                    + "positivo y par");
        }

    }

}
