
package com.mycompany.rectangulo;

import java.util.Scanner;


public class pruebaRectangulo {
    public static void main(String[] args) {
       Rectangulo rec = new Rectangulo();
       
       //rec.setAnchura(10);
       //rec.setLongitud(6);
       
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros para calcular el perimetro de un rectangulo");
        System.out.println("Ingresar un numero: ");
        rec.setAnchura(leer.nextDouble());
        
        System.out.println("Ingresar un numero: ");
        rec.setLongitud(leer.nextDouble());
        
        System.out.println("*Este es el Resultado*");
        System.out.println("El Perimetro del rectangulo es: " + rec.calcularPerimetro() + "cm");
        System.out.println("El Area del rectangulo es: " + rec.calcularArea() + "cm");
    }
}
