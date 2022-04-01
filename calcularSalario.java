
package com.mycompany.rectangulo;


public class calcularSalario {
    private double HorTrabajadas;
    private double PagPorHora;

    public calcularSalario() {
    }

    public calcularSalario(double HorTrabajadas, double PagPorHora) {
        this.HorTrabajadas = HorTrabajadas;
        this.PagPorHora = PagPorHora;
    }

    public double getHorTrabajadas() {
        return HorTrabajadas;
    }

    public void setHorTrabajadas(double HorTrabajadas) {
        this.HorTrabajadas = HorTrabajadas;
    }

    public double getPagPorHora() {
        return PagPorHora;
    }

    public void setPagPorHora(double PagPorHora) {
        this.PagPorHora = PagPorHora;
    }

    double calcularSalario() {
        double salario = 0;
        double horasPordos;
        double horasPortres;
        
        if (this.HorTrabajadas <= 40) {
            salario = this.HorTrabajadas * this.PagPorHora;
            return salario;
        } else if (this.HorTrabajadas > 40 && this.HorTrabajadas < 48) {
            horasPordos = this.HorTrabajadas - 40;
            salario = (40 * this.PagPorHora) + (horasPordos * this.PagPorHora * 2);
            return salario; 
        } else if (this.HorTrabajadas > 48) {
            horasPortres = this.HorTrabajadas - 48;
            salario = (40 * this.PagPorHora) + (8 * this.PagPorHora * 2)+(horasPortres * this.PagPorHora * 3);
            return salario;
        }
        return salario;
    }
    
    double renta(calcularSalario salario){
    double rent;
    salario.calcularSalario();
    rent = salario.calcularSalario() * 0.10  ;
    return rent;
    }
    
    double SalarioLiquido(calcularSalario SalLiquido){
        double SalarioLiquido;
        
        SalarioLiquido = SalLiquido.calcularSalario() - SalLiquido.renta(SalLiquido);
        return SalarioLiquido;
    }
}

