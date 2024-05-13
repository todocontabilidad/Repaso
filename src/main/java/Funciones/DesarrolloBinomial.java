//Crear un programa para determinar el desarrollo binomial hasta el infinito
package Funciones;
import java.util.*;

public class DesarrolloBinomial {
    
    static void DesarrolloBi(){
        System.out.println();
    }
    static void factorial(int n){
        
    }
    public static void main(String[] args) {
        //Ingrese el binomio
        Scanner leeri=new Scanner(System.in);
        System.out.println("(a+b)^n\t Ingrese el valor de a: ");
        int a=leeri.nextInt();
        System.out.println("(a+b)^n\t Ingrese el valor de b: ");
        int b=leeri.nextInt();
        System.out.println("(a+b)^n\t Ingrese el valor de n: ");
        int n=leeri.nextInt();
        for (int i = 0; i <= n+1; i++) {
            //Generamos el primer término
            System.out.println((n/n)*a);
        }
    }
    
}
