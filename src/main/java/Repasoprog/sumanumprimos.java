
package Repasoprog;

public class sumanumprimos extends Padre{
    //Atributos 
    public int a1=2,a2=3;
    //Constructores
    public sumanumprimos(int a, int b, int c, int s) {
        super(a, b, c, s);
    }
    //Metodos
    public void SumanumerosPrimos(){
        a=2;
        b=5;
        s=a+b;
        System.out.println("La sumatoria es:"+s);
    }
    public sumanumprimos(){
        
    }
}
