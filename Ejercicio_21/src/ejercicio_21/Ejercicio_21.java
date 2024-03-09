
package ejercicio_21;

import java.util.Scanner;

public class Ejercicio_21 {

    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     double ladoa, ladob, ladoc, perimetro, semiperimetro, area;
     
     System.out.print("Ingrese el valor del lado a: ");
     ladoa=entrada.nextDouble();
     
      System.out.print("Ingrese el valor del lado b: ");
     ladob=entrada.nextDouble();
     
      System.out.print("Ingrese el valor del lado c: ");
     ladoc=entrada.nextDouble();
        
     triangulo t = new triangulo (ladoa, ladob, ladoc);
     
     System.out.print("El perimetro es : " +t.calcularperimetro());
       System.out.print("El semiperimetro es : "+t.calcularsemiperimetro());
        System.out.print("El area es : "+t.calculararea());
     
     
    }
    
}
