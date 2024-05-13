
package Repasoprog;
import java.util.*;
public class VectoresPares extends Padre{
    //Atributos 
    private int vector[],k,j,pares;
    //Constructores

    public VectoresPares(int[] vector, int k, int j, int pares, int a, int b, int c, int s) {
        super(a, b, c, s);
        this.vector = vector;
        this.k = k;
        this.j = j;
        this.pares = pares;
    }
    //Métodos
    public void MostrarPares(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese limite del vector: ");
        k=leer.nextInt();
        int[]vector=new int[k];
        for (int i = 0; i < k; i++) {
            vector[i]=leer.nextInt();
        }
        System.out.println("Los elementos pares del vector son: ");
        for (int i = 0; i < k; i++) {
            if(vector[i]%2==0){
                System.out.print("["+vector[i]+"]");
            }
        }
        System.out.println("\nLa suma de todos los elementos del vector o arreglo unidimensional: ");
        for (int i = 0; i < k; i++) {
            a=vector[i]+a;
        }
        System.out.println("La sumatoria total es: "+a);
        
    }
    
    public VectoresPares(){
        
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getPares() {
        return pares;
    }

    public void setPares(int pares) {
        this.pares = pares;
    }
    
}
