
package ejercicio7;
import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroA, numeroB;
        System.out.println("Ingrese el numero A:");
        numeroA = entrada.nextInt();
        System.out.println("Ingrese el numero B:");
        numeroB = entrada.nextInt();
        if (numeroA > numeroB) {
            System.out.println("A es mayor que B");
        } else if (numeroA == numeroB) {
            System.out.println("A es igual a B");
        } else if ( numeroA < numeroB) {
            System.out.println("A es menor que B");
        }
    }
    
}
