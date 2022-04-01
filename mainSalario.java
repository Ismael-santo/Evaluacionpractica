
package com.mycompany.rectangulo;

import java.util.Scanner;


public class mainSalario {
    public static void main(String[] args) {
        double Sala1 = 0.0;
        double Sala2 = 0.0;
        double Sala3 = 0.0;
        calcularSalario salario = new calcularSalario();
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("**Digitar  horas trabajadas** :");
        salario.setHorTrabajadas(leer.nextDouble());
        System.out.println("**Introducir pago por hora** :");
        salario.setPagPorHora(leer.nextDouble());
        System.out.println("----------------------------");
        salario.calcularSalario();
        
        Sala1 = salario.calcularSalario();
        Sala2 = salario.renta(salario);
        Sala3 = salario.SalarioLiquido(salario);
        System.out.println("**Salario bruto es** : $"+Sala1);
        System.out.println("**El monto de la retencion aplicada es** : $"+Sala2);
        System.out.println("**salario liquido es** : $"+Sala3);
    }
}
