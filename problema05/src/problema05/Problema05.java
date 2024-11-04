/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Scanner ;
/**
 *
 * @author DELL
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Variables
        
        Scanner leer = new Scanner(System.in) ;
        String nombre_1 ;
        String nombre_2 ;
        String apellido_1 ;
        String apellido_2 ;
        String espacio = " " ;
        double netflix ;
        double youtube_premium ;
        double dropbox ;
        double spotify ;
        double promocion_netflix = .23 ;
        double promocion_youtube = .23 ;
        double promocion_dropbox = .45 ;
        double valor_total ;
        
        
        // Ingreso por teclado y lectura
        
        System.out.println("Ingrese su primer nombre:");
        nombre_1 = leer.nextLine();
        System.out.println("Ingrese su segundo nombre:");
        nombre_2 = leer.nextLine();
        System.out.println("Ingrese su primer apellido:");
        apellido_1 = leer.nextLine();
        System.out.println("Ingrese su segundo apellido:");
        apellido_2 = leer.nextLine();
        System.out.println("\nHola" + espacio + nombre_1 + "," + espacio 
            + "ingresa el valor mensual que pagas en los siguientes servicios:");
        System.out.println("\nValor mensual a pagar de Netflix:");
        netflix = leer.nextDouble();
        System.out.println("Valor mensual a pagar de Youtube Premium:");
        youtube_premium = leer.nextDouble();
        System.out.println("Valor mensual a pagar de Dropbox:");
        dropbox = leer.nextDouble();
        System.out.println("Valor mensual a pagar de Spotify:");
        spotify = leer.nextDouble();
        
        valor_total = netflix + youtube_premium + dropbox + spotify ;
        
        // Impresión semifinal
        
        System.out.printf("Estimado %s, los valores normales a pagar de cada "
                + "servicio son los siguientes:"
                + "\nNetflix: $%.2f\nYoutube Premium: $%.2f\nDropbox: "
                + "$%.2f\nSpotify: $%.2f\nEl valor normal total a pagar"
                + " es de: $%.2f\n",
                nombre_1,
                netflix,
                youtube_premium,
                dropbox,
                spotify,
                valor_total);
        
        // Calculo de servicios con descuento
        
        netflix = netflix + (- promocion_netflix * netflix);
        youtube_premium = youtube_premium + (- promocion_youtube * youtube_premium);
        dropbox = dropbox + (- promocion_dropbox * dropbox);
        valor_total = netflix + youtube_premium + dropbox + spotify;
        
        // Impresión final
        
        System.out.println("\nEstimado" + espacio + nombre_1 + "," + espacio + 
                "aplicando el descuento de 23% en Netflix y Youtube Premium, "
                + "\ny el descuento de 45% en Dropbox, tienes un costo final "
                + "\nde cada producto de la siguiente manera:");
        
        System.out.printf("\nNetflix: $%.2f\nYoutube Premium: $%.2f\nDropbox: "
                + "$%.2f\nSpotify: $%.2f\nEl valor final total a pagar con "
                + "descuentos es de: $%.2f",
                netflix,
                youtube_premium,
                dropbox,
                spotify,
                valor_total);
    }
    
}
