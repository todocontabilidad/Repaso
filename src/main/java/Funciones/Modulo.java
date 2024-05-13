
package Funciones;
import java.util.*;
public class Modulo {
//Crear la fución
   // int divisor;
    static void divisor(int x){//el valor ya esta definido en esta linea, pero lo guardare en otra variable local
        //recibir el número y determinar cuantos divisores primos tiene 
        int divisor,y;
        divisor=x;
        //solo queda determinar los divisores 
        for (int i = 1; i <= x; i++) {
            if(divisor%i==0){
                System.out.println("Es divisor: "+i);
                y=i;
                primo(y);
            }
        }
    }
    static void primo(int y){
        //Formula para determinar si es primo 
        //como dice la definición, los números primos son todos los números que son divisibles por el uno y ellos mismos
        int contador=0,prim;
        for (int i = 1; i <= y; i++) {
            if(y%i==0){
                contador=contador+1;
            }
        }
        if(contador==2){
            System.out.println(+y+" El número es PRIMO");
        }
        contador=0;
    }
    public static void main(String[] args) {
        //Módulo al que se le pase un número entero y devuelva el número de divisores primos que tiene
        //pedir un número al usuario
        //Definir valores
        int x,y,primo;
        Scanner leeri=new Scanner (System.in);
        System.out.println("Ingrese un número para la evalución: ");
        x=leeri.nextInt();
        //a la hora de mandar un valor a la función con el paremetro de retorno debemos crear una valor que lo almacene
        //puesto que generaria un error logico
        divisor(x);
    }
    
}
