

package com.mycompany.rectangulo;


public class Rectangulo {

    private double Longitud;
    private double Anchura;
    
    public Rectangulo(double longitud, double anchura) {
        this.Longitud = 1;
        this.Anchura = 1;
    }
    Rectangulo() {
        
    }

    public double getLongitud() {
        return Longitud;
    }

    public void setLongitud(double longitud) {
        if (longitud > 0.00 && longitud < 20.0) {
        this.Longitud = longitud;
        }   
    }

    public double getAnchura() {
        return Anchura;
    }

    public void setAnchura(double anchura) {
        if (anchura > 0.00 && Longitud < 20.0){
        this.Anchura = anchura;
        }else{
            System.out.println("La anchura debe ser > 0 < 20.0");
        }
    }

    double calcularPerimetro() {
        double perimetro = (2 * Anchura) + (2 * Longitud);
    return perimetro;
    }

    double calcularArea() {
        double area = (Anchura * Longitud);
    return area;
    }
    
}

