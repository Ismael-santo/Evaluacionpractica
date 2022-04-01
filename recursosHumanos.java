
package com.mycompany.rectangulo;

import java.util.Scanner;


public class recursosHumanos {
     private Scanner teclado;
    private String nombre,direccion,Nedificio;
    private int cargoDe,codigo,edad;
    private double salario,salariofinal,renta,AFP,ISSS;
    

    
   public void inicializar() {
        teclado=new Scanner(System.in);
        System.out.print("Ingresar nombre:");
        nombre=teclado.next();
        System.out.print("Ingresar edad:");
        edad=teclado.nextInt();
        System.out.print("Ingresar salario bruto:");
        salario=teclado.nextDouble();
        System.out.print("Ingresar 1 si su cargo es por servicio y 2 si es permanente:");
        cargoDe =teclado.nextInt();
          System.out.print("Ingresar su direccion:");
        direccion=teclado.next();
          System.out.print("Ingresar Numero de edificio ");
        Nedificio=teclado.next();
       System.out.println("");
    }

    public void imprimir() {
        System.out.println("Nombre:"+nombre+"\n");
        System.out.println("Edad:"+edad+"\n");
         System.out.println("direccion:"+direccion+"\n");
         System.out.println("numero de edificio :"+Nedificio );
         System.out.println("");
    }
    public void cargo() {
        if (cargoDe==1) {
            renta= (salario * 0.10);
             salariofinal= (salario-renta);
             System.out.println("");
            System.out.print("su cargo es por servicio y su salario final es :"+ salariofinal);
             System.out.println("");
            
        } else if(cargoDe==2){
             renta= (salario * 0.10);
             ISSS= (salario* 0.14);
             AFP= (salario * 0.10);
             salariofinal= (salario-renta-ISSS-AFP);
             System.out.println("");
            System.out.print(" su cargo es permanente y su salario final es :"+salariofinal);
                    System.out.println("");
        }
        }
    public static void main(String[] args) {
        Edificio objeto= new Edificio();
     recursosHumanos Dpersona1;
        Dpersona1=new recursosHumanos();
        Dpersona1.inicializar();
        Dpersona1.imprimir();
        Dpersona1.cargo();
        
         System.out.println("");
         
        objeto.getUbicacion();
        objeto.getNombreE();
        objeto.getCantidadDep();
        objeto.getCantidadPisos();
        
        System.out.println("");
         
         CodigoArea  codigo= new CodigoArea();
         codigo.getComputos();
         codigo.getBiblioteca();
         codigo.getCancha();
         codigo.getLab();
         codigo.getZonaVerd();
}}
