/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        // Hijo 1
        String nombre1;
        double gasto1;
        
        // Hijo 2
        String nombre2;
        double gasto2;
        
        // Hijo 3
        String nombre3;
        double gasto3;
        
        //Total
        double gastoTotal;
        
        // Hijo 1
        System.out.println("Ingrese el nombre del primer hijo");
        nombre1 = leer.nextLine();
        System.out.println("Ingrese el gasto del primer hijo");
        gasto1 = leer.nextDouble();
        
        // Hijo 2
        System.out.println("Ingrese el nombre del segundo hijo");
        leer.nextLine();
        nombre2 = leer.nextLine();
        System.out.println("Ingrese el nombre el gasto del segundo hijo");
        gasto2 = leer.nextDouble();
        
        // Hijo 3
        System.out.println("Ingrese el nombre del tercer hijo");
        leer.nextLine();
        nombre3 = leer.nextLine();
        System.out.println("Ingrese el nombre el gasto del tercer hijo");
        gasto3 = leer.nextDouble();
        
       gastoTotal = gasto1 + gasto2 + gasto3;
       
        System.out.println(nombre1 + " " + "gastó un total de" + " " + gasto1 
                + " " + "dólares");
        System.out.println(nombre2 + " " + "gastó un total de" + " " + gasto2 
                + " " + "dólares");
        System.out.println(nombre3 + " " + "gastó un total de" + " " + gasto3 
                + " " + "dólares");
        
        System.out.println("Entre:" + nombre1 + ", " + nombre2 + " y " + nombre3 + 
                "gastaron un total de:" + gastoTotal);
    }
    
}