/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.pruebafigura;

/**
 *
 * @author CApat
 */
public class TrianguloRectangulo {
    int base; // Atributo que define la base de un triángulo rectángulo
    int altura; // Atributo que define la altura de un triángulo rectángulo
    
    public TrianguloRectangulo(int base, int altura) {
    this.base = base;
    this.altura = altura;
    }
    
    double calcularArea() {
    return (base * altura / 2);
    }
   
    double calcularHipotenusa() {
    return Math.pow(base*base + altura*altura, 0.5);
    }
    /**
    * Método que determina si un triángulo es:
    * - Equilatero: si sus tres lados son iguales
    * - Escaleno: si sus tres lados son todos diferentes
    * - Escaleno: si dos de sus lados son iguales y el otro es diferente de
    * los demás
    */
    double calcularPerimetro() {
    return (base + altura + calcularHipotenusa()); /* Invoca al
    método calcular hipotenusa */
    }
    void determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa()))
            System.out.println("Es un triangulo equilatero"); /* Todos sus
            lados son iguales */
        else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
            System.out.println("Es un triangulo escaleno"); /* Todos sus
            lados son diferentes */
        else
            System.out.println("Es un triangulo isosceles"); /* De otra
            manera, es isósceles */
    }
}
