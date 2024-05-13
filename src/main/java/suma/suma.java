/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suma;

/**
 *
 * @author ASUS PRIME
 */
public class suma {
    //Atributos
    private int valor1,valor2,resultado;
    //Constructores
    public suma(int a, int b) {
        this.valor1 = a;
        this.valor2 = b;
    }
    //Método
    public void adicion(){
        resultado=valor1+valor2;
    }
    public void imprimir(){
        adicion();
        System.out.println("La sumatoria por POO es: "+resultado);
    }
}
