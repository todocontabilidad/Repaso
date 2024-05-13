
package Funciones;
import java.util.*;
public class Holamundo {
    static void hola(int x){
        System.out.println("Ingrese la frase que se repetira");
        Scanner leers=new Scanner(System.in);
        String y;
        y=leers.nextLine();
        for (int i = 0; i < x; i++) {
            System.out.println(y);
        }
    }

 
    public static void main(String[] args) {
        //Llamar a la funcion que le pasamos un valor como parametro
        System.out.println("Ingrese un número para la generación de repeticiones: ");
        Scanner leer=new Scanner(System.in);
        int x;
        try{
            x=leer.nextInt();
            System.out.println("Ingrese la frase que quiere que se repita: ");
            hola(x);// no es un error logíco por que no retorna ningun valor 
        }catch(Exception e){
            System.out.println("El valor que ingreso no es un número... ");
        }
        
    }
    
}
