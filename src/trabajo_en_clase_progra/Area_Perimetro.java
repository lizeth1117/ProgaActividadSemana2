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
public class Area_Perimetro {
    public static void main(String[] args) {
        
        Float base, altura, perimetro, area;
 Scanner entrada=new Scanner(System.in);
 System.out.println("Favor ingrese la base del rectangulo");
 base=entrada.nextFloat();
 System.out.println("Favor ingrese la altura del rectanguro");        
 altura=entrada.nextFloat();
 perimetro= (base*2)+(altura*2)  ;
 area= base*altura;
        System.out.println("El perimentro de el rectangulo es: "+perimetro+"\n"
                 +"El area del rectangulo es: "+area);
    }
    
}
