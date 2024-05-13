
package Repasoprog;

import java.util.*;
public class GenerarMatrizCeroUno  extends Padre{
    //Atributos 
    private int x,y,z,numero,valor;
    Random u=new Random();
    //Constructores 
    Scanner leeri=new Scanner(System.in);
    public GenerarMatrizCeroUno(int x, int y, int z, int numero, int valor, int a, int b, int c, int s) {
        super(a, b, c, s);
        this.x = x;
        this.y = y;
        this.z = z;
        this.numero = numero;
        this.valor = valor;
    }
    //Métodos
    public void Generar(){
        System.out.println("Introduzca Filas:");
        x=leeri.nextInt();
        System.out.println("Introduzca Columnas:");
        y=leeri.nextInt();
        int [][]m=new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                m[i][j]=0;
                if(i==j){
                    m[i][j]=1;
                }
            }
            
        }
        //Mostrar la matriz
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("["+m[i][j]+"]");
            }
            System.out.println("");
        }
    }
    public GenerarMatrizCeroUno(){
        
    }
}
