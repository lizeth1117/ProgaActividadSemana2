/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_en_clase_progra;

import java.util.Scanner;

/**
 *
 * @author lizet
 */
public class Puntaje_total {
    public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese cuantos partidos a ganado:"); 
        int pganados=entrada.nextInt();
        System.out.println("Ingrese cuantos partidos a perdidos:"); 
        int pperdidos=entrada.nextInt();
        System.out.println("Ingrese cuantos partidos a ematados:"); 
        int pempatados=entrada.nextInt();
        
        int puntajefinal=(pganados*3)+(pempatados*1);
        System.out.println("El puntaje dinal es de "+puntajefinal);
        
                
    }
    
}
