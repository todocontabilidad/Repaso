
package Repasoprog;
import java.util.*;

public class Factorial extends Padre {
    //Atributos 
    private int x,y,z,factorial,numero;
    Scanner leeri=new Scanner(System.in);
    Random u=new Random();
    //Constructores

    public Factorial(int x, int y, int z, int factorial, int numero, int a, int b, int c, int s) {
        super(a, b, c, s);
        this.x = x;
        this.y = y;
        this.z = z;
        this.factorial = factorial;
        this.numero = numero;
    }
    //Métodos
    public void EncontrarFactorial(){
        System.out.println("Ingrese el valor del cual decea encontrar el facotiral: ");
        x=leeri.nextInt();
        y=1;
        for (int i = 1; i <= x; i++) {
            y=y*i;
        }
        System.out.println("El factorial es: "+y);
    }
    public Factorial(){
        
    }
}
