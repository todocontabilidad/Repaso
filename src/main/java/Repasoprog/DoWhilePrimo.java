
package Repasoprog;
import java.util.*;
public class DoWhilePrimo  extends Padre{
    //Atributos
    private int x,y,z;
    Random u=new Random();
    Scanner leeri=new Scanner(System.in);
    //Constructores

    public DoWhilePrimo(int x, int y, int z, int a, int b, int c, int s) {
        super(a, b, c, s);
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    //Métodos
    public void Primo(){
        do{
            y=0;
            System.out.println("Ingrese un números para determinar si es PRIMO: ");
            x=leeri.nextInt();
            for (int i = 2; i <=x; i++) {
                if(x%i==0){
                    y=y+1;
                    if(y>1){
                        System.out.println("No es primo");
                        break;
                    }
                }           
            }
            if(y==1){
                System.out.println("El numero es PRIMO----->"+x);
            }
        }while(x>0);
    }
    public DoWhilePrimo(){
        
    }
}
