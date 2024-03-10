
package ejercicio11;
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N1, N2, N3, mayor;
        System.out.println("Ingrese el numero 1:");
        N1 = entrada.nextInt();
        System.out.println("Ingrese el numero 2:");
        N2 = entrada.nextInt();
        System.out.println("Ingrese el numero 3:");
        N3 = entrada.nextInt();
        if ((N1 > N2) && (N1>N3)) {
            mayor = N1;
        } else if (N2 > N3) {
            mayor = N2;
        } else {
            mayor = N3;
        }
        System.out.println("El mayor entre "+N1+","+N2+" y "+N3+" es "+mayor);
    }
    
}
