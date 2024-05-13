
package Repasoprog;
import java.util.*;
public class ElCuadrado extends Padre {
    //Atributos 
    private double x,y,z;
    Scanner leeri=new Scanner(System.in);
    //Constructores
    public ElCuadrado(double x, double y, double z, int a, int b, int c, int s) {
        super(a, b, c, s);
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //Métodos
    public void Cuadrado(){
        do{
            System.out.println("Ingrese el valor diferente de 0 (cero) ");
            x=leeri.nextInt();
            y=Math.pow(x, 2);
            System.out.println("El cuadrado de: "+x+" Es igual a: "+y);
        }while(x!=0&&x>0);
      
    }
    public ElCuadrado(){
        
    }
}
