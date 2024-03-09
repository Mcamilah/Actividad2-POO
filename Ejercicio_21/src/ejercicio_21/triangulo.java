package ejercicio_21;


public class triangulo {
    double ladoa, ladob, ladoc;
    double s;
    
triangulo(double ladoa, double ladob, double ladoc) {
    this.ladoa= ladoa;
    this.ladob=ladob;
    this.ladoc=ladoc;
}
    
   double calcularperimetro() {
       return (ladoa+ladob+ladoc);
   }
   
   double calcularsemiperimetro() {
       return (ladoa+ladob+ladoc)/2;
   }
   
   double calculararea(){
       s = (ladoa+ladob+ladoc)/2;
       return Math.sqrt(s*(s-ladoa)*(s-ladob)*(s-ladoc));
   }
}
