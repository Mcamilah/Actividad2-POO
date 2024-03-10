
package ejercicio15;
import java.util.Scanner;
public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int PA, PB, PC, PD;
        System.out.println("Ingrese el peso de la esfera A:");
        PA = entrada.nextInt();
        System.out.println("Ingrese el peso de la esfera B:");
        PB = entrada.nextInt();
        System.out.println("Ingrese el peso de la esfera C:");
        PC = entrada.nextInt();
        System.out.println("Ingrese el peso de la esfera D:");
        PD = entrada.nextInt();
        if ((PA == PB)&&(PA == PC)) {
            System.out.println("La esfera D es la diferente");
            if (PD > PA) {
              System.out.println("Y es de mayor peso");  
            } else {
                System.out.println("Y es de menor peso");
            }
        } else if ((PA == PB)&&(PA == PD)) {
            System.out.println("La esfera C es la diferente");
            if (PC > PA) {
                System.out.println("Y es de mayor peso");
            } else {
                System.out.println("Y es de menor peso");
            }
        } else if ((PA == PC)&&(PA == PD)) {
            System.out.println("La esfera B es la diferente");
            if (PB > PA) {
                System.out.println("Y es de mayor peso");
            } else {
                System.out.println("Y es de menor peso");
            }
        } else {
            System.out.println("La esfera A es la diferente");
            if (PA > PB) {
                System.out.println("Y es de mayor peso");
            } else {
                System.out.println("Y es de menor peso");
            }
        }
    }
    
}
