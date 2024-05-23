/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polindrom;

/**
 *
 * @author FER
 */
public class Polindromo {
     public static boolean esPalindromo(String cadena) {
        int i = 0;
        int j = cadena.length() - 1;

        while (i < j) {
            // Ignorar los espacios y signos de puntuación
            while (!Character.isLetterOrDigit(cadena.charAt(i)) && i < j) {
                i++;
            }
            while (!Character.isLetterOrDigit(cadena.charAt(j)) && i < j) {
                j--;
            }

            if (Character.toLowerCase(cadena.charAt(i)) != Character.toLowerCase(cadena.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true; 
}
}
