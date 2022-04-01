
package com.mycompany.rectangulo;


public class CodigoArea {
    String Computos,Biblioteca,ZonaVerd,Lab,Cancha;
public CodigoArea(String Computos, String Biblioteca, String ZonaVerd, String Lab, String Cancha) {
        this.Computos = Computos;
        this.Biblioteca = Biblioteca;
        this.ZonaVerd = ZonaVerd;
        this.Lab = Lab;
        this.Cancha = Cancha;
    }

    public CodigoArea() {
    }

    public String getComputos() {
        System.out.println("*El codigo de los computos es us01*");
        return Computos;
    }

    public void setComputos(String Computos) {
        this.Computos = Computos;
    }

    public String getBiblioteca() {
        System.out.println("*El codigo de  biblioteca es 565*");
        return Biblioteca;
    }

    public void setBiblioteca(String Biblioteca) {
        this.Biblioteca = Biblioteca;
    }

    public String getZonaVerd() {
        System.out.println("el codigo de la zona verde es V344*");
        return ZonaVerd;
    }

    public void setZonaVerd(String ZonaVerd) {
        this.ZonaVerd = ZonaVerd;
    }

    public String getLab(){
        System.out.println("*El codigo del laboratorio es L202*");
        return Lab;
    }

    public void setLab(String Lab) {
        this.Lab = Lab;
    }

    public String getCancha() {
        System.out.println("*El codigo de  cancha es C586*");
        return Cancha;
    }

    public void setCancha(String Cancha) {
        this.Cancha = Cancha;
    }

    
}
