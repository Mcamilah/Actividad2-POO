package ejercicio_19;

import java.util.Scanner;

public class Ejercicio_19 {

    public static void main(String[] args) {
       System.out.println("Ingrese el valor del lado del triangulo equilatero:");
       Scanner entrada= new Scanner(System.in);
       double lado, area, altura, perimetro;
       lado = entrada.nextDouble();
       Triangulo_equilatero triangulo = new Triangulo_equilatero (lado);
       
       area=triangulo.calculararea();
       altura=triangulo.calcularaltura();
       perimetro=triangulo.calcularperimetro();
       
       System.out.print("El area es:" + area);
       System.out.print("La altura es:" + altura);
       System.out.print("El perimetro es:" + perimetro);
    }
    
}
