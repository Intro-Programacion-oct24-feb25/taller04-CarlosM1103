/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        double base;
        double altura;
        double area;
        
        // Base del triángulo
        System.out.println("Ingrese la base del triángulo");
        base = leer.nextDouble();
        
        // Altura del triángulo
        System.out.println("Ingrese la altura del triángulo");
        altura = leer.nextDouble();
        
        // Calcular area del triángulo
        area = (base * altura)/2;
        
        // Impresión final
        System.out.printf("El area del triángulo es: \n" + area);
        
    }
    
    
}
