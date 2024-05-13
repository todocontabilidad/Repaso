
package Repasoprog;
import java.util.*;
public class SumadeNumeros extends Padre {
    //Atributos 
    private int x,y,z,suma,par,impar;
    private String Hola,uno,dos;
    Scanner leeri=new Scanner(System.in);
    Scanner leers=new Scanner(System.in);
    Random u=new Random();
    //Constructores 

    public SumadeNumeros(int x, int y, int z, int suma, int par, int impar, String Hola, String uno, String dos, int a, int b, int c, int s) {
        super(a, b, c, s);
        this.x = x;
        this.y = y;
        this.z = z;
        this.suma = suma;
        this.par = par;
        this.impar = impar;
        this.Hola = Hola;
        this.uno = uno;
        this.dos = dos;
    }
    //Métodos
    public void Pares(){
        System.out.println("Ingrese hasta que numero decea realizar la suma: ");
        System.out.println("En el conjuno de los numeros naturales, sucesivos");
        x=leeri.nextInt();
        for (int i = 0; i <=x; i++) {
            suma=suma+i;
        }
        System.out.println("La suma de los numeros sucesivos del conjunot del os nuemros naturales es\n: "+suma);
    }
    public SumadeNumeros(){
        
    }
}
