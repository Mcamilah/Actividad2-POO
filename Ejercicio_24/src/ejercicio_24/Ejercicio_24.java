
package ejercicio_24;

import java.util.Scanner;

public class Ejercicio_24 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A,B,C; 
        
        System.out.println("Ingrese el peso de A: ");
         A=entrada.nextDouble();
        
        System.out.println("Ingrese el peso de B: ");
         B=entrada.nextDouble();
         
        System.out.println("Ingrese el peso de C: ");
         C=entrada.nextDouble();

        if (A >= B && A >= C) {
            System.out.println("La esfera A tiene el mayor peso.");
        } else if (B >= A && B >= C) {
            System.out.println("La esfera B tiene el mayor peso.");
        } else {
            System.out.println("La esfera C tiene el mayor peso.");
        }

       
}
    }
    

