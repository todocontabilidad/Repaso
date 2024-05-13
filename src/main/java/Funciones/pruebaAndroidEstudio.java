
package Funciones;

import java.util.Scanner;

public class pruebaAndroidEstudio {
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        a=7;
        b=3;
        double x=(double)a/3;
        
        System.out.println("La división es:"+x);
        // Crear los valores de entrada
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el valor ha determinar, cuanto es el impuesto al valor agregado: ");
        double y;
        y=leer.nextDouble();
        System.out.println("El valor del impuesto IVA es: "+iva(y));
    }
    
    static double iva(double a){
        double resultado=a*0.13;
        return resultado;
    }
}
