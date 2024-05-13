
package Repasoprog;
import java.util.*;

public class cocienteyresiduo extends Padre{
    //Atributos
    private int cociente, residuo;
    //Costructores

    public cocienteyresiduo(int cociente, int a, int b, int c, int s) {
        super(a, b, c, s);
        this.cociente = cociente;
    }
    
    
    //Metodos
    public void calcular(){
        System.out.println("Ingrese el númerados: ");
        Scanner leer=new Scanner(System.in);
        a=leer.nextInt();
        System.out.println("Ingrese el denominador: ");
        b=leer.nextInt();
        cociente=a/b;
        System.out.println("El cociente es: "+cociente);
        residuo=a%b;
        System.out.println("El residuo es: "+residuo);
    }
    public cocienteyresiduo(){
        
    }

    public void setCociente(int cociente) {
        this.cociente = cociente;
    }

    public void setResiduo(int residuo) {
        this.residuo = residuo;
    }
    
    public int getCociente() {
        return cociente;
    }

    public int getResiduo() {
        return residuo;
    }
    
}
