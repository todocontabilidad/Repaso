//Ordenar los elementos del vector
package Repasoprog;
import java.util.*;
public class OrdenarVector extends Padre{
    //Atributos 
    private int x,y,z,numero,numerodos;
    Random u=new Random();
    Scanner leeri=new Scanner(System.in);
    //Constructores

    public OrdenarVector(int x, int y, int z, int numero, int numerodos, int a, int b, int c, int s) {
        super(a, b, c, s);
        this.x = x;
        this.y = y;
        this.z = z;
        this.numero = numero;
        this.numerodos = numerodos;
    }
    //Métodos
    public void Ordenar(){
        System.out.println("Ingrese el tamaño del vector");
        x=leeri.nextInt();
        int v[]=new int[x];
        for (int i = 0; i < x; i++) {
            v[i]=u.nextInt(100);
        }
        //Mostramos el vector 
        for (int i = 0; i < x; i++) {
            System.out.print("["+v[i]+"]");
        }
        System.out.println("");
        //Ordenar los elemenos del vector
        for (int j = 0; j < x; j++) {
            for (int i = 0; i < x-1; i++) {
                if(v[i]>v[i+1]){
                    numero=v[i+1];
                    v[i+1]=v[i];
                    v[i]=numero;
                }
            }
        }
        System.out.println("Vector Ordenado");
        for (int i = 0; i < x; i++) {
            System.out.print("["+v[i]+"]");
        }
    }
    public OrdenarVector(){
        
    }
}
