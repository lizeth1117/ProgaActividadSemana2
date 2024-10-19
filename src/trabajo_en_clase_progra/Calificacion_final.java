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
public class Calificacion_final {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in) ;
        float parcial1, parcial2, parcial3, examen,trabajo,notafinal,promedio ;
 
        System.out.println("ingrese la nota del parcial 1");
        parcial1= entrada.nextFloat() ;
        System.out.println("ingrese la nota del parcial 2");
        parcial2= entrada.nextFloat() ;
        System.out.println("ingrese la nota del parcial 3");
        parcial3= entrada.nextFloat() ;
        System.out.println("ingrese la nota del examen final");
        examen = entrada.nextFloat() ;
        System.out.println("ingrese la nota del trabajo final");
        trabajo= entrada.nextFloat() ;
        
        promedio= (parcial1+parcial2+parcial3)/3 ;
        notafinal=(float)((promedio*0.55)+(examen*0.30)+(trabajo*0.15)); 
    
        System.out.println("El promedio es de:"+String.format("%.2f",promedio)+" La nota final es de: "+String.format("%.2f",notafinal));
    }
}
