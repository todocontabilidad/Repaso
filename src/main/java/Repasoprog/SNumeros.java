
package Repasoprog;
import java.util.*;

public class SNumeros extends Padre{
    //Atributos 
    //Constructores
    public SNumeros(int a, int b, int c, int s){
        super(a, b, c, s);
        
    }

    //Metodos
    public void Fibonacci() {
        a=0;
        b=1;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el limite del la serie:");
        c=leer.nextInt();
        System.out.println("El primer en la serie Fibonacci es: "+a);
        System.out.println("El segundo numero en la series Finobacci es: "+b);
        for (int i = 0; i < c-2; i++) {
            s=a+b;
            System.out.println("El siguiente en la serie es: "+s+" Posición: "+(i+1));
            a=b;
            b=s;
        }
        
    }
    public SNumeros(){
        
    }
}
