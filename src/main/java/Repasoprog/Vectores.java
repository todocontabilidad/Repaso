
package Repasoprog;
import java.util.*;
public class Vectores extends Padre{
    //Atributos 
    private int k,j[];
    //Constructores

    public Vectores(int[] j, int a, int b, int c, int s) {
        super(a, b, c, s);
        this.j = j;
    }

    
    //Metodos
    public void LlenarVector(){
        System.out.println("Delimitar tamaño del vector:");
        Scanner leer1=new Scanner(System.in);
        k=leer1.nextInt();
        int[]j=new int[k];
        for (int i = 0; i < k; i++) {
            System.out.println("Ingrese los elementos del vector o arreglo unidimensional:");
            j[i]=leer1.nextInt();
        }
        System.out.println("Los elementos del vector o arreglo unidimensional son:");
        for (int i = 0; i < k; i++) {
            System.out.print("["+j[i]+"]");
            
        }
    }
    public Vectores(){
        
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int[] getJ() {
        return j;
    }

    public void setJ(int[] j) {
        this.j = j;
    }

    
    
}
