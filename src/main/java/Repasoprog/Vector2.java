
package Repasoprog;

import java.util.*;
public class Vector2 extends Padre {
    //Atributos 
    private int vector[],k,j;
    //Constructores

    public Vector2(int[] vector, int k, int j, int a, int b, int c, int s) {
        super(a, b, c, s);
        this.vector = vector;
        this.k = k;
        this.j = j;
    }
    //Métodos
    public void NumerosIguales(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Delimita los elementos del vector:");
        a=leer.nextInt();
        int[]vector=new int[a];
        System.out.println("------------------------------------");
        for (int i = 0; i < a; i++) {
            System.out.println("Llenar el vector: ");
            vector[i]=leer.nextInt();
        }
        System.out.println("------------------------------------");
        System.out.println("Ingrese el elemento de comparación: ");
        b=leer.nextInt();
        c=0;
        for (int i = 0; i < a; i++) {
            c=c+1;
            if (vector[i]==b) {
                System.out.println(""+vector[i]+" se encuentra en la posición: "+"["+c+"]");
            }
        }
    }
    public Vector2(){
        
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
    
}
