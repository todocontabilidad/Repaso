
package Repasoprog;
import java.util.*;
public class VectorImpares extends Padre{
    //atributos 
    private int x,y,z;
    Random u=new Random();
    Scanner leeri=new Scanner(System.in);
    //Constructores 

    public VectorImpares(int x, int y, int z, int a, int b, int c, int s) {
        super(a, b, c, s);
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //Métodos
    public void sumaImpares(){
        System.out.println("Ingrese el tamaño del vector: ");
        a=leeri.nextInt();
        int v[]=new int[a];
        for (int i = 0; i < a; i++) {
            v[i]=u.nextInt(100);
        }
        //Mostramos el vector 
        for (int i = 0; i < a; i++) {
            System.out.print("["+v[i]+"]");
        }
        //Sumar los elementos impares 
        for (int i = 0; i < a; i++) {
            if(v[i]%2==1){
                c=v[i]+c;
                b++;
            }
        }
        System.out.println("\nLa cantidad de elementos impares es: "+b);
        System.out.println(""
                + "La suma de los elementos Impares del vector es: "+c);
    }
    public VectorImpares(){
        
    }
}
