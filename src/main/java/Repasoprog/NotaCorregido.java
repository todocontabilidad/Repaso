
package Repasoprog;
import java.util.*;
public class NotaCorregido extends Padre {
    //Atributos 
    private int x,y,z;
    Random u=new Random();
    Scanner leeri=new Scanner (System.in);
    //Constructores 

    public NotaCorregido(int x, int y, int z, int a, int b, int c, int s) {
        super(a, b, c, s);
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //Métodos 
    public void Calificación(){
        System.out.println("Ingrese la nota o calificación: ");
        x=leeri.nextInt();
        if(x>=0&&x<=10){
            if(x<6){
                System.out.println("Insuficiente");
            }
            if(x==6){
                System.out.println("Bien");
            }
            if(x==7||x==8){
                System.out.println("Notable");
            }
            if(x==9||x==10){
                System.out.println("Sobresaliente");
            }
        }else{
            System.out.println("El numero no esta en el rango de 0 a 10, gracias genio jajaja");
        }
    }
    public NotaCorregido(){
        
    }
}
