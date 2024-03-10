
package ejercicio12;
import java.util.Scanner;
public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String NOM;
        int NHT, VHN, HET, HEE8, SALARIO;
        System.out.println("Ingrese el nombre del trabajador:");
        NOM = entrada.nextLine();
        System.out.println("Ingrese el numero de horas trabajadas:");
        NHT = entrada.nextInt();
        System.out.println("Ingrese el valor por hora de trabajo:");
        VHN = entrada.nextInt();
        if (NHT > 40) {
            HET = NHT - 40;
            if (HET > 8) {
                HEE8 = HET - 8;
                SALARIO = 40 * VHN + 16 * VHN + HEE8 * 3 * VHN;
            } else {
                SALARIO = 40 * VHN + HET * 2 * VHN;
            }
        } else {
            SALARIO = NHT * VHN;
        }
        System.out.println("El trabajador "+NOM+" devengo: $ "+SALARIO);
    }
    
}
