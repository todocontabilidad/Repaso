//Determinar los elementos primos en un rango dado
package Repasoprog;
import java.util.*;
public class PrimosenunRango extends Padre{
    //Atributos 
    private int primo,noprimo,cero,x;
    Scanner leeri=new Scanner(System.in);
    //Constructores

    public PrimosenunRango(int primo, int noprimo, int cero, int x, int a, int b, int c, int s) {
        super(a, b, c, s);
        this.primo = primo;
        this.noprimo = noprimo;
        this.cero = cero;
        this.x = x;
    }
    //Métodos
    public void HallarPrimos(){
        System.out.println("Ingrese el rango maximo para hallar numero primos:");
        x=leeri.nextInt();
        for (int i = 1; i <= x; i++) {
            primo=0;
            for (int j = 1; j <= i; j++) {
                if(i%j==0){
                    primo=primo+1;
                    if(primo>2){
                        System.out.println("El numero no es primo");
                        break;
                    }
                }
            }
            if(primo==2){
                System.out.println("El numero es Primo "+i);
            }
        }
    }
    public PrimosenunRango(){
        
    }
}
