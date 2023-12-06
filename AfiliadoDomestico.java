/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica;

/**
 *
 * @author CltControl
 */
public class AfiliadoDomestico extends Afiliado{
    private int cantidad_en_hogar;
    private String ced_empleador;

    public AfiliadoDomestico(String nombres, String apellidos, String cedula, int edad, int aportaciones, double salario,int cantidad_en_hogar, String ced_empleador) {
        super(nombres, apellidos, cedula, edad, aportaciones, salario);
        this.cantidad_en_hogar = cantidad_en_hogar;
        this.ced_empleador = ced_empleador;
    }

    public int getCantidad() {
        return cantidad_en_hogar;
    }

    public void setCantidad(int cantidad) {
        this.cantidad_en_hogar = cantidad;
    }

    public String getCed_empleador() {
        return ced_empleador;
    }

    public void setCed_empleador(String ced_empleador) {
        this.ced_empleador = ced_empleador;
    }

    @Override
    public String toString() {
        return super.toString()+", Cantidad de personas en el hogar= " + cantidad_en_hogar + ", Cedula del Empleador= " + ced_empleador ;
    }
    @Override
    public boolean equals(Object o){
        if(this==o)
            return true;
        if(o==null)
            return false;
        if(this.getClass()!=o.getClass())
            return false;
        AfiliadoDomestico a=(AfiliadoDomestico)o;
        return this.cantidad_en_hogar==a.cantidad_en_hogar && this.ced_empleador.equals(a.ced_empleador);
    }
    @Override
    public boolean jubilar(){
        return this.getAportaciones()>=400 && this.getEdad()>=62;
    }
    @Override
    public double pension(){
        if(this.jubilar())
            return (this.getSalario()*(this.getAportaciones()/400))+(this.getSalario()*0.10);
        else
            return 0;
    }
}
