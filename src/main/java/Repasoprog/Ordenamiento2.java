
package Repasoprog;
import java.util.*;
public class Ordenamiento2 extends Padre{
    //Atributos 
    private int x,y,z,numero,mayor,menor;
    Random u=new Random();
    //Constructores 
    Scanner leeri=new Scanner(System.in);
    Scanner leers=new Scanner(System.in);

    public Ordenamiento2(int x, int y, int z, int numero, int mayor, int menor, int a, int b, int c, int s) {
        super(a, b, c, s);
        this.x = x;
        this.y = y;
        this.z = z;
        this.numero = numero;
        this.mayor = mayor;
        this.menor = menor;
    }
    //Métodos
    public void Ordenar(){
        System.out.println("Ingrese el tamaño del vector que sera generado por Random:");
        x=leeri.nextInt();
        int v[]=new int [x];
        for (int i = 0; i < x; i++) {
            v[i]=u.nextInt(200);
        }
        //Mostrar el vector 
        for (int i = 0; i < x; i++) {
            System.out.print("["+v[i]+"]");
        }
        //Ordenar los elementos de forma ascendente 
        for (int j = 0; j < x; j++) {
            for (int i = 0; i < x-1; i++) {
                if(v[i]>v[i+1]){
                    mayor=v[i];
                    v[i]=v[i+1];
                    v[i+1]=mayor;
                }
            }
        }
        System.out.println("");
        //Mostrar el vector 
        for (int i = 0; i < x; i++) {
            System.out.print("["+v[i]+"]");
        }
        
    }
    public Ordenamiento2(){
        
    }
}
