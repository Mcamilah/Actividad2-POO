
package ejercicio14;
import java.util.Scanner;
public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double VD1, VD2, VD3, SALAR, TOTVEN, PORVEN, SALAR1, SALAR2, SALAR3;
        System.out.println("Ingrese las ventas del depto 1:");
        VD1 = entrada.nextDouble();
        System.out.println("Ingrese las ventas del depto 2:");
        VD2 = entrada.nextDouble();
        System.out.println("Ingrese las ventas del depto 3:");
        VD3 = entrada.nextDouble();
        System.out.println("Ingrese el salario de los vendedores:");
        SALAR = entrada.nextDouble();
        TOTVEN = VD1 + VD2 + VD3;
        PORVEN = TOTVEN * 0.33;
        if (VD1 > PORVEN) {
            SALAR1 = SALAR + 0.2*SALAR;
        }else {
            SALAR1 = SALAR;
        }
        if (VD2 > PORVEN) {
            SALAR2 = SALAR + 0.2*SALAR;
        } else {
            SALAR2 = SALAR;
        }
        if (VD3 > PORVEN) {
            SALAR3 = SALAR + 0.2*SALAR;
        } else {
            SALAR3 = SALAR;
        }
        System.out.println("Salario vendedores del depto. 1 "+SALAR1);
        System.out.println("Salario vendedores del depto. 2 "+SALAR2);
        System.out.println("Salario vendedores del depto. 3 "+SALAR3);
    }
    
}
