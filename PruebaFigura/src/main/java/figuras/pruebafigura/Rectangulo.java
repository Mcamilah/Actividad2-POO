/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.pruebafigura;

/**
 *
 * @author CApat
 */
public class Rectangulo {
    int base; // Atributo que define la base de un rectángulo
    int altura; // Atributo que define la altura de un rectángulo
    
    Rectangulo(int base, int altura) {
    this.base = base;
    this.altura = altura;
    }
    
    double calcularArea() {
    return base * altura;
    }
   
    double calcularPerímetro() {
    return (2 * base) + (2 * altura);
    }
}