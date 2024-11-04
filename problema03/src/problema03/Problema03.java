/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Variables
        Scanner leer = new Scanner(System.in);
        double costo_minuto_telefono ;
        int minutos_en_el_mes ;
        String dirección ;
        String nombres_completos ;
        double valor_cancelar;
        String espacio = " ";
        
        //Entradas y lectura
        
        System.out.println("Ingrese sus nombres completos");
        nombres_completos = leer.nextLine();
        System.out.println("Ingrese su dirección");
        dirección = leer.nextLine();
        System.out.println("Ingrese el número de minutos que consumió en el "
                + "teléfono en el mes");
        minutos_en_el_mes = leer.nextInt();
        System.out.println("Ingrese el costo por minuto de usar el teléfono");
        leer.nextLine();
        costo_minuto_telefono = leer.nextDouble();
        
        // Proceso
        valor_cancelar = costo_minuto_telefono * minutos_en_el_mes ;
        
        // Impresión     
        System.out.println("Reporte:\n" + "Nombres completos:" + espacio + 
         nombres_completos + 
         "\n" + "\tDirección:"+ espacio + dirección + 
         "\n" + "Costo por minuto:" + espacio +"s"+costo_minuto_telefono + 
         "\n" + "\tNúmero de minutos consumidos:" + espacio + minutos_en_el_mes + 
         "\n" + "\t\tValor a cancelar:" + espacio + "s" + valor_cancelar);
    }
    
}
