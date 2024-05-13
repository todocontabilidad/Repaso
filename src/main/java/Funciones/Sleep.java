
package Funciones;

import java.util.Scanner;
import java.util.*;

public class Sleep {

    
    public static void main(String[] args) throws InterruptedException {
        int x;
        Random random=new Random();
        Scanner leer=new Scanner(System.in);
        //Ingresar los elementos de un vector
        System.out.println("Ingrese la dimensión del vector: ");
        x=leer.nextInt();
        int []v=new int[x];
        for (int i = 0; i < x; i++) {
            Thread.sleep(1000);//Pausa del tiempo de ejecución de la linea
            v[i]=random.nextInt(100);
            System.out.print("["+v[i]+"]");
        }
    }
    
}
//Gracias mi Díos por todo el conocimiento que me das cada día.
