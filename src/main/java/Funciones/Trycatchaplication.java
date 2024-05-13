/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Funciones;
import java.util.*;

/**
 *
 * @author ASUS PRIME
 */
public class Trycatchaplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Todo el código en esta parte para el analisis
        System.out.println("Ingrese un valor númerico para llamar a la función: ");
        Scanner leer=new Scanner (System.in);
        int x;
        try{
            x=leer.nextInt();
            System.out.println("llamada a la función y pasar parametros: ");
        }catch(Exception e){
            System.out.println("Ingrese un valor númerico...");
        }
        
    }
    
}
