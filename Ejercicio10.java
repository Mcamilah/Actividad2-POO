
package ejercicio10;
import java.util.Scanner;
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double PAT, EST, PAGMAT;
        String NOM, NI;
        System.out.println("Ingrese el numero de inscripcion:");
        NI = entrada.nextLine();
        System.out.println("Ingrese el nombre del estudiante:");
        NOM = entrada.nextLine();
        System.out.println("Ingrese el patrimonio:");
        PAT = entrada.nextDouble();
        System.out.println("Ingrese el estrato social:");
        EST = entrada.nextDouble();
        System.out.println("Ingrese el pago por matricula:");
        PAGMAT = entrada.nextDouble();
        if ((PAT > 2000000) && (EST > 3)) {
            PAGMAT = PAGMAT + 0.03 * PAT;
        }
        System.out.println("El estudiante con numero de inscripcion "+NI);
        System.out.println("y nombre "+NOM+" debe pagar: $"+PAGMAT);
    }
    
}
