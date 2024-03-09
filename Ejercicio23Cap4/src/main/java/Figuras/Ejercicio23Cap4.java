package Figuras;

import java.util.Scanner;

public class Ejercicio23Cap4 {

public static void main(String[] args) {
            double a, b, c, valor1, valor2, determinante;
                     
                Scanner entrada = new Scanner(System.in);
                System.out.println("ingrese el valor de a: ");
                a = entrada.nextInt();
                
                System.out.println("ingrese el valor de b: ");
                b = entrada.nextInt();

                System.out.println("ingrese el valor de c: ");
                c = entrada.nextInt();
                
                
               determinante = Math.sqrt(Math.pow(b, 2)-(4*a*c));
                
                
                
                if (determinante > 0) {
                valor1= (-b + determinante)/(2*a);
                valor2= (-b - determinante)/(2*a);
                System.out.println("Las poisbles soluciones son:  " + valor1 + " y " + valor2);
                }
                
                else{
                System.out.println("La ecuacion de segundo grado no tiene soluciones reales");
                }
        }
}
