package ejercicio22cap4.ejercicio22cap4;

import java.util.Scanner;
public class Ejercicio22Cap4 {

    public static void main(String[] args) {
            String nombre_empleado;
            double salario_hora, horas_trabajadas, salario_mensual;
           
                Scanner entrada = new Scanner(System.in);
                System.out.println("ingrese el nombre del empleado: ");
                nombre_empleado = entrada.next();
                
                System.out.println("ingrese el numero de horas tabajadas: ");
                horas_trabajadas = entrada.nextDouble();   
                
                System.out.println("ingrese el salario por hora: ");
                salario_hora = entrada.nextDouble();   
            
                salario_mensual=horas_trabajadas*salario_hora;
                
                if (salario_mensual > 450000){
                    System.out.println("Nombre: " + nombre_empleado + " y salario: " + salario_mensual);
                }
                else{
                    System.out.println("Nombre: " + nombre_empleado);
                }
        }
}
