//Programa que halle la suma de los n terminos de una sucesión aritmetica 
package Funciones;
import java.util.*;
import java.util.Scanner;

public class serieAritmetica {

    static int Diferencia(int a1,int a2){
        //Para allar la diferencia agarramos el segundo termino y lo restamos al primero
        int d=a2-a1;
        return d;
    }
    static int an(int a1,int an1,int d1){
        int a_esimo=a1+(an1-1)*d1;
        return a_esimo;
    }
    static int Sumatoria(int an1,int a1,int n){
        int sumatoria=(an1/2)*(a1+n);
        return sumatoria;
    }
    public static void main(String[] args) {
        // Ingresar por teclado los primeros 4 terminos 
        Scanner leeri=new Scanner(System.in);
        System.out.println("Ingrese termino primero: ");
        int a1=leeri.nextInt();
        System.out.println("Ingrese termino segundo: ");
        int a2=leeri.nextInt();
        int d1=Diferencia(a1,a2);
        System.out.println("La diferencia es: "+d1);
        System.out.println("La formula es: a=a1+(n-1)d");
        System.out.println("Ingrese el n termino que decea encontrar: ");
        int an1=leeri.nextInt();
        int n=an(a1,an1,d1);
        System.out.println("El n-esimo termino es: "+n);
        int Suma=Sumatoria(an1,a1,n);
        System.out.println("La sumatoria de los n terminos es: "+Suma);
    }
    
}
