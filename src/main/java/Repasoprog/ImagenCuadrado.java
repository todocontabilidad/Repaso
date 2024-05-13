
package Repasoprog;
import java.util.*;
public class ImagenCuadrado extends Padre {
    //Atributos
    private int x,y,z,media,media2,media3;
    Random u=new Random();
    Scanner leeri=new Scanner(System.in);
    //Constructores 
    public ImagenCuadrado(int x, int y, int z, int media, int media2, int media3, int a, int b, int c, int s) {
        super(a, b, c, s);
        this.x = x;
        this.y = y;
        this.z = z;
        this.media = media;
        this.media2 = media2;
        this.media3 = media3;
    }
    //Métodos 
    public void Cuadrado(){
        System.out.println("Ingrese Tamaño del Arbol:");
        x=leeri.nextInt();
        y=x*2;
        media=(y/2);
        media3=(y/2);
        z=media;
        System.out.println("media: "+media);
        System.out.println("¡¡¡Feliz Navidad!!!");
        for (int i = 1; i < x; i++) {
            for (int j = 1; j < y; j++) {
                System.out.print(" ");
                if(media<=j && media3>=j){
                    System.out.print("*");
                }
            }
            media=media-1;
            System.out.println("");
        }
        for (int i = 0; i < y; i++) {
            System.out.print(" ");
            if(i==z-2)
                System.out.print("||||");
        }
    }
    public ImagenCuadrado(){
        
    }
}
