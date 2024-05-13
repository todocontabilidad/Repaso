
package Repasoprog;
import java.util.*;
public class Media extends Padre{
    //Atributos 
    private int suma,conteo,x,y,z;
    private double media;
    Scanner leeri=new Scanner(System.in);
    Random u=new Random();
    //Constructores 

    public Media(int suma, int conteo, int x, int y, int z, double media, int a, int b, int c, int s) {
        super(a, b, c, s);
        this.suma = suma;
        this.conteo = conteo;
        this.x = x;
        this.y = y;
        this.z = z;
        this.media = media;
    }
    //Métodos 
    public void CalcularMedia(){
        //para hallar la media primer debemos tener la sumatoria de todos los eventos dividido entre los eventos 
        System.out.println("Ingrese Nota o Calificación: ");
        x=leeri.nextInt();
        while(x>0){
            suma=suma+x;
            conteo++;
            System.out.println("Ingrese Nota o Calificación: ");
            x=leeri.nextInt();
        }
        media=Double.valueOf(suma)/Double.valueOf(conteo);
        System.out.println("La Media de las notas o calificación es: "+media);
        
    }
    
    public Media(){
        
    }
}
