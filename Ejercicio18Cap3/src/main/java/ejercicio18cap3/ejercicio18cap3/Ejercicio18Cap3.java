/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio18cap3.ejercicio18cap3;

/**
 *
 * @author CApat
 */
import java.util.Scanner;
public class Ejercicio18Cap3 {

        public static void main(String[] args) {
            int codigo_empleado;
            String nombre_empleado;
            double salario_hora, horas_trabajadas, retencion, salario_bruto, salario_neto, pctj_retencion;
           
                Scanner entrada = new Scanner(System.in);
                System.out.println("ingrese el codigo del empleado: ");
                codigo_empleado = entrada.nextInt();
                
                System.out.println("ingrese el nombre del empleado: ");
                nombre_empleado = entrada.next();
                
                System.out.println("ingrese el numero de horas tabajadas: ");
                horas_trabajadas = entrada.nextDouble();   
                
                System.out.println("ingrese el salario por hora: ");
                salario_hora = entrada.nextDouble();   
                
                System.out.println("ingrese el porcentaje de retencion: ");
                pctj_retencion = entrada.nextDouble();   
            
                salario_bruto=horas_trabajadas*salario_hora;
                retencion=salario_bruto*(pctj_retencion/100);
                salario_neto=salario_bruto-retencion;

                System.out.println("Codigo: " + codigo_empleado);
                System.out.println("Nombre: " + nombre_empleado);
                System.out.println("El salario bruto es: " + salario_bruto);
                System.out.println("El salario neto es: " + salario_neto);
        }
    }

