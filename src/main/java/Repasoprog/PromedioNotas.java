
package Repasoprog;
import java.util.*;
public class PromedioNotas extends Padre{
    //Atributos 
    private int x,y,z,promedio;
    private double div;
    Random u=new Random();
    Scanner leeri=new Scanner(System.in);
    //Constructores

    public PromedioNotas(int x, int y, int z, int promedio, double div, int a, int b, int c, int s) {
        super(a, b, c, s);
        this.x = x;
        this.y = y;
        this.z = z;
        this.promedio = promedio;
        this.div = div;
    }
    //Métodos
    public void Promedio(){
        System.out.println("Ingrese la primera Nota: ");
        x=leeri.nextInt();
        System.out.println("Ingrese la segunda Nota: ");
        y=leeri.nextInt();
        System.out.println("Ingrese la tercera Nota: ");
        z=leeri.nextInt();
        promedio=(x+y+z)/3;
        if(promedio>=0&& promedio<=11){
            if(promedio>=0 && promedio <=5){
                System.out.println("Reprobado");
            }else if(promedio>4&&  promedio<8){
                System.out.println("Aprobo");
            }else if(promedio>7 && promedio <11){
                System.out.println("Excelencia");
            }
        }
    }
    public PromedioNotas(){
        
    }
}
