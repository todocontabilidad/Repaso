
package Repasoprog;
import java.util.*;

public class Dias extends Padre{
    //Atributos
    private int x; 
    //Constructores
    public Dias(int x, int a, int b, int c, int s) {
        super(a, b, c, s);
        this.x = x;
    }
    //Metodos
    public void diasLiteral(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese dias: ");
        x=leer.nextInt();
        switch(x){
            case 1:System.out.println("Lunes");
            break;
            case 2:System.out.println("Martes");
            break;
            case 3:System.out.println("Miercoles");
            break;
            case 4:System.out.println("Jueves");
            break;
            case 5:System.out.println("Viernes");
            break;
            case 6:System.out.println("Sabado");
            break;
            case 7:System.out.println("Domingo");
            break;
        }
        
    }
    public Dias(){
        
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
    
}
