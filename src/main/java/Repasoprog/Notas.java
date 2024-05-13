
package Repasoprog;
import java.util.*;
public class Notas extends Padre{
    //Atributos 
    private int x;
    Random u=new Random();
    Scanner leeri=new Scanner(System.in);
    //Construcotres 

    public Notas(int x, int a, int b, int c, int s) {
        super(a, b, c, s);
        this.x = x;
    }
    //Métodos 
    public void Calificar(){
        System.out.println("Ingrese la Nota o calificación: ");
        x=leeri.nextInt();
        if(x>=0 && x<5){
            System.out.println("Insuficiente:"+x);
        }else
            if(x==5)
                System.out.println("Suficiente");
            else 
                if(x==6)
                    System.out.println("Bien");
                else 
                    if(x==7 || x==8)
                        System.out.println("Notable");
                    else 
                        if(x==9 || x==10)
                            System.out.println("Sobresaliente");
        if(x>10){
            System.out.println("El numero que ha introducido no esta en el rango de calificación");
        }
    }
    public Notas (){
        
    }
}
