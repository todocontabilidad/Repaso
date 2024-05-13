//Programa para determinar si un número es primo 
package Repasoprog;
import java.util.*;

public class DeterminarsiesPrimo extends Padre {
    //Atributos 
    private int x,y,z;
    Random u=new Random();
    //constructores 
    Scanner leeri=new Scanner(System.in);
    public DeterminarsiesPrimo(int x, int y, int z, int a, int b, int c, int s) {
        super(a, b, c, s);
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //Métodos
    public void EsPrimo(){
        System.out.println("Ingrese el numero para ser evaluado si es primo: ");
        x=leeri.nextInt();
        for (int i = 2; i < x+1; i++) {
            if(x%i==0){
                b++;
            }
        }
        System.out.println("conteo "+b);
        if(b==1){
            System.out.println("El numero es Primo: ");
        }else
            System.out.println("No es primo: ");
    }
    public DeterminarsiesPrimo(){
        
    }
}
