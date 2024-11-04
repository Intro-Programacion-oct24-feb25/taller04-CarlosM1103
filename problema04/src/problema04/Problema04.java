/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Scanner ;
/**
 *
 * @author DELL
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // Variables
      Scanner leer = new Scanner(System.in) ;
      String nombres_completos;
      int cpu;
      int teclado;
      int raton;
      int pantalla;
      int valor_cancelar;
      String espacio;
      espacio = " ";
      
      // Entradas por telcado y lectura
        System.out.println("Ingrese sus nombres completos:");
        nombres_completos = leer.nextLine();
        System.out.println("Ingrese el valor del CPU:");
        cpu = leer.nextInt();
        System.out.println("Ingrese el valor del teclado:");
        teclado = leer.nextInt();
        System.out.println("Ingrese el valor del ratón:");
        raton = leer.nextInt();
        System.out.println("Ingrese el valor de la pantalla:");
        pantalla = leer.nextInt();
        
        // Proceso
       
        valor_cancelar = cpu + teclado + raton + pantalla;
        
        // Impresión valores
        System.out.println("Reporte:" 
                + "\nNombres del cliente:" + espacio + nombres_completos
                + "\nValores iniciales:"
                + "\nCPU: $" + espacio + cpu
                + "\nTeclado: $" + espacio + teclado
                + "\nRatón: $" + espacio + raton
                + "\nPantalla: $" + espacio + pantalla
                + "\n\n\nValor a cancelar: $" + valor_cancelar);
        
    }
    
}
