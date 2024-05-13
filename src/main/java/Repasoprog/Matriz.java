
package Repasoprog;
import java.util.*;
public class Matriz extends Padre {
    //Atributos 
    private int x,y,z;
    Random u=new Random();
    Scanner leeri=new Scanner(System.in);
    //Constructores 

    public Matriz(int x, int y, int z, int a, int b, int c, int s) {
        super(a, b, c, s);
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //Métodos 
    public void Generar(){
        System.out.println("Ingrese las filas:");
        x=leeri.nextInt();
        System.out.println("Ingrese Columnas: ");
        y=leeri.nextInt();
        int v[][]=new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                v[i][j]=u.nextInt(2);
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(+v[i][j]);
            }
            System.out.println("");
        }
    }
    public Matriz(){
        
    }
}
