/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.practico1;

import java.util.Scanner;

/**
 *
 * @author nico
 */
public class EjercicioPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Escribir un programa que pida dos números enteros por teclado y calcule 
       //la suma de los dos. El programa deberá después mostrar el resultado de la suma
       int num1 , num2 , total ; 
       Scanner leer = new Scanner (System.in);
      
        System.out.println("Ingrese dos valores");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        total = num1 + num2 ;
        System.out.println("El resultado de la suma es " + total);
        
       
       
    }
    
}
