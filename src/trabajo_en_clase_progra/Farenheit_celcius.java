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
public class Farenheit_celcius {
    public static void main(String[] args) {
        
        // farenheit a celsius 
        
        double farenheit;
        double celsius ;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Favor ingrese la temperatura en grados Farenheit:");
        farenheit=entrada.nextDouble();
               
        celsius=(((farenheit-32)*5)/9) ;
  
        System.out.println("La temperatura en grados celsius es: "+String.format("%.2f",celsius));
    
}
}