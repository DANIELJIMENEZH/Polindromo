/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polindrom;

/**
 *
 * @author FER
 */
public class Polindrom {

      public static void main(String[] args) {
        String cadena = "a man a plan a canal far a way";
        boolean resultado = esPalindromo(cadena);

        if (resultado) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
