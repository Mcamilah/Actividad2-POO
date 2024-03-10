
package ejercicio13;
import java.util.Scanner;
public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double VC, VP ;
        String COLOR;
        System.out.println("Ingrese el color de la pelota:");
        COLOR = entrada.nextLine();
        System.out.println("Ingrese el valor de la compra:");
        VC = entrada.nextDouble();
        VP = 0;
        if ("blanco".equals(COLOR)) {
            VP = VC;
        } else if ("verde".equals(COLOR)) {
            VP = VC - VC * 0.10;
        } else if ("amarillo".equals(COLOR)) {
            VP = VC - VC * 0.25;
        } else if ("azul".equals(COLOR)) {
            VP = VC - VC * 0.50;
        } else if ("roja".equals(COLOR)) {
            VP = 0;
        }
        System.out.println("El cliente debe pagar: $"+VP);
    }
    
}
