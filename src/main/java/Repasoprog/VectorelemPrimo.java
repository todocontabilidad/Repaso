//Determinar cuantos elementos primos existen en un vector 
package Repasoprog;
import java.util.*;
public class VectorelemPrimo extends Padre{
    //Atributos 
    private int y,z,primo,noprimo,conteo;
    Random x=new Random();
    Scanner leeri=new Scanner(System.in);
    //Constructores
    public VectorelemPrimo(int y, int z, int primo, int noprimo, int conteo, int a, int b, int c, int s) {
        super(a, b, c, s);
        this.y = y;
        this.z = z;
        this.primo = primo;
        this.noprimo = noprimo;
        this.conteo = conteo;
    }
    //Métodos
    public void EvaluarVector(){
        System.out.println("Ingrese el tamaño del vector: ");
        y=leeri.nextInt();
        int v[]=new int[y];
        for (int i = 0; i < y; i++) {//Llenamos el vector 
            v[i]=x.nextInt(100);
        }
        for (int i = 0; i < y; i++) {//Mostrar los elementos del vector 
            System.out.print("["+v[i]+"]");
        }//Determinar los elementos primos del vector 
        for (int i = 0; i < y; i++) {
            primo=0;
            z=v[i];
            for (int j = 1; j <= z ; j++) {
                if(v[i]%j==0){
                    primo=primo+1;
                    if(primo>2){
                        System.out.println("no es primo: ["+v[i]+"]");
                        break;
                    }
                }
            }
            if(primo==2){
                System.out.println("El numero es Primo "+v[i]);
            }
        }
        
        System.out.println("");
    }
    
    public VectorelemPrimo(){
        
    }
}
