/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repasoprog;

/**
 *
 * @author ASUS PRIME
 */
public class ManejodeTiempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inicio del programa");

        try {
            // Pausar la ejecución del programa durante 3 segundos (3000 milisegundos)
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Después de la pausa de 3 segundos");
    }
    
}
