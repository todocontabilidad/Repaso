/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma;
import java.util.*;
/**
 *
 * @author ASUS PRIME
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedir valores por teclado
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int a=leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int b=leer.nextInt();
        //Crear el objeto
        suma objeto=new suma(a,b);
        objeto.imprimir();
    }
    
}
