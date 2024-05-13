//Crear un programa que llene un vector con números randon enteros, con la dimensión ingresada por teclado
// y determine los valores primos
package Funciones;
import java.util.*;

public class vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        Random random = new Random();
        System.out.println("Ingrese la dimensión del vector: ");
        int x,y,z;
        x=leer.nextInt();
        int []v=new int[x];
        //Llenar el vector con números random
        for (int i = 0; i < x; i++) {
            v[i]=random.nextInt(100);
        }
        System.out.println("Estos son los elementos del vector");
        //Mostrar los elementos del vector 
        for (int i = 0; i < x; i++) {
            System.out.println("["+v[i]+"]");
        }
        System.out.println("---------------------------");
         // Llamar a una función y pasar el vector como argumento
        primo(v);
    }
    
    
    // Definir una función que acepta un vector como parámetro
    public static void primo(int[] Vector){
        int cont=1;
        System.out.println("Llamada de la función para hallar los números primos:");
        //vendra el vector con sus elementos para ser evaluados
        for (int i = 0; i < Vector.length; i++) {
            cont=1;
            //Determinar si el elementos es primo
            System.out.println("["+Vector[i]+"]");
            //Ingresar un contador
            for (int j = 1; j < Vector.length+1 ; j++) {
                if(Vector[i]%j==0){
                cont=cont+1;
                }
            }
            if(cont==2){
                System.out.println("El número es primo:");
            }
        }
    }
    
}
