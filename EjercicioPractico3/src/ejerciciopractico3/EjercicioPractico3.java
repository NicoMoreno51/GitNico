/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopractico3;

import java.util.Scanner;

/**
 *
 * @author nico
 */
public class EjercicioPractico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*    Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
        Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/
    Scanner teclado = new Scanner(System.in);
    String frase ;
        System.out.println("Ingrese una frase");
        frase = teclado.nextLine();
    
        System.out.println("Convertida a mayuscula "+ frase.toUpperCase());    
        System.out.println("Convertida a minuscula "+ frase.toLowerCase()); 
    
    
    
    }
    
}
