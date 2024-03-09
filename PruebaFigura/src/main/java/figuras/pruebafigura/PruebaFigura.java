/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package figuras.pruebafigura;

import java.util.Scanner;

/**
 *
 * @author CApat
 */
public class PruebaFigura {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int radio;
        System.out.println("ingrese el valor del radio del circulo: ");
        radio = entrada.nextInt();
        Circulo figura1 = new Circulo(radio);
        
        int base_rect, altura_rect;
        System.out.println("ingrese el valor de la base del rectangulo: ");
        base_rect = entrada.nextInt();
        System.out.println("ingrese el valor de la altura del rectangulo: ");
        altura_rect = entrada.nextInt();
        Rectangulo figura2 = new Rectangulo(base_rect,altura_rect);
        
        int lado;
        System.out.println("ingrese el valor del lado del cuadrado: ");
        lado = entrada.nextInt();
        Cuadrado figura3 = new Cuadrado(lado);
        
        int base_tri, altura_tri;
        System.out.println("ingrese el valor de la base del triangulo: ");
        base_tri = entrada.nextInt();
        System.out.println("ingrese el valor de la altura del triangulo: ");
        altura_tri = entrada.nextInt();
        TrianguloRectangulo figura4 = new TrianguloRectangulo(base_tri,altura_tri);
        
        System.out.println("El area del circulo es = " + figura1.calcularArea());
        System.out.println("El perimetro del circulo es = " + figura1.calcularPerimetro());
        System.out.println();
        System.out.println("El area del rectangulo es = " + figura2.calcularArea());
        System.out.println("El perimetro del rectangulo es = " + figura2.calcularPerímetro());
        System.out.println();
        System.out.println("El area del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perimetro del cuadrado es = " + figura3.calcularPerímetro());
        System.out.println();
        System.out.println("El area del triangulo es = " + figura4.calcularArea());
        System.out.println("El perimetro del triangulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();
    }
}
