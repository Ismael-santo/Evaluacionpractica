
package com.mycompany.rectangulo;


public class Edificio {
    String Ubicacion,NombreE,CantidadDep,CantidadPisos;

    public Edificio(String Ubicacion, String NombreE,String CantidadDep, String CantidadPisos) {
        this.Ubicacion = Ubicacion;
        this.NombreE = NombreE;
          this.CantidadDep = CantidadDep;
        this.CantidadPisos = CantidadPisos;
    }

    

    Edificio() {
      
    }

    public String getUbicacion() {
        System.out.println("*Km 64 1/2 , desvio Hacienda el Nilo sobre autopista a Zacatecoluca y Usulutan El Salvador* ");        
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        
        this.Ubicacion = Ubicacion;
    }

    public String getNombreE(){ 
        System.out.println("*ITCA FEPADE Edificio B*");
        return NombreE;
    }

    public void setNombreE(String NombreE) {
        this.NombreE = NombreE;
    }

     
    public String getCantidadDep() {
        System.out.println("*cuatro departamentos* ");
        return CantidadDep;
    }

    public void setCantidadDep(String CantidadDep) {
        this.CantidadDep = CantidadDep;
    }

    public String getCantidadPisos() {
        System.out.println("*Dos pisos en edificio B y tres pisos en edificio C*");
        return CantidadPisos;
    }

    public void setCantidadPisos(String CantidadPisos) {
        this.CantidadPisos = CantidadPisos;
    }

   
    }
