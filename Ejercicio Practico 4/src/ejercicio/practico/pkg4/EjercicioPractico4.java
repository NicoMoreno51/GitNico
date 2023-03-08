/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.practico.pkg4;

import java.util.Scanner;

/**
 *
 * @author nico
 */
public class EjercicioPractico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
        //La fórmula correspondiente es: F = 32 + (9 * C / 5).
    
        double cent , far ;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de grados centigrados");
        cent = leer.nextDouble() ;
        far = 32 + (9 * cent / 5);
        System.out.println("en F° son "+ far + "°");
        
}}
