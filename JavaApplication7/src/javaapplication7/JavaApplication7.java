/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author nico
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
        //el triple y la raíz cuadrada de ese número. 
        //Nota: investigar la función Math.sqrt().
        Scanner leer = new Scanner(System.in);
        int val1;
        System.out.println("Ingrese un valor");
        val1 = leer.nextInt();
        
        System.out.println("El doble es "+ val1*2 );
        System.out.println("El triple es "+ val1*3 );
        System.out.println("La raiz es "+ Math.sqrt(val1));
        
        
        
    }
    
}
