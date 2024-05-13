
package Repasoprog;
import java.util.*;
public class ArbolNavidad extends Padre {
    //Atributos 
    private int x,y,z,media,valor;
    Random u=new Random();
    Scanner leeri=new Scanner(System.in);
    //Constructor

    public ArbolNavidad(int x, int y, int z, int media, int valor, int a, int b, int c, int s) {
        super(a, b, c, s);
        this.x = x;
        this.y = y;
        this.z = z;
        this.media = media;
        this.valor = valor;
    }
    //Métodos
    public void Arbol(){
        System.out.println("Ingrese el tamaño del arbol Filas:_");
        x=leeri.nextInt();
        y=x*2;
        media=y/2;
        valor=media;
        for (int i = 1; i < x; i++) {
            for (int j = 1; j < y; j++) {
                System.out.print(" ");
                if(j>=media&&j<=valor){
                    System.out.print("*");
                }
            }
            media=media-1;
            System.out.println("");
        }
    }
    public ArbolNavidad(){
        
    }
}
