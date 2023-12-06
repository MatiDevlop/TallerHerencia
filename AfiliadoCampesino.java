/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica;

/**
 *
 * @author CltControl
 */
public class AfiliadoCampesino extends Afiliado{
    private double hectareas;

    public AfiliadoCampesino(String nombres, String apellidos, String cedula, int edad, int aportaciones, double salario,double hectareas) {
        super(nombres, apellidos, cedula, edad, aportaciones, salario);
        this.hectareas = hectareas;
    }

    public double getHectareas() {
        return hectareas;
    }

    public void setHectareas(double hectareas) {
        this.hectareas = hectareas;
    }

    @Override
    public String toString() {
        return super.toString()+", Hectáreas= " + hectareas ;
    }
    
    @Override
    public boolean equals(Object o){
        if(this==o)
            return true;
        if(o==null)
            return false;
        if(this.getClass()!=o.getClass())
            return false;
        AfiliadoCampesino a=(AfiliadoCampesino)o;
        return this.hectareas==a.hectareas;
    }
    @Override
    public boolean jubilar(){
        return this.getAportaciones()>300 && this.getEdad()>60;
    }
    @Override
    public double pension(){
        if(this.jubilar())
            return (this.getSalario()*(this.getAportaciones()/300))+(this.getSalario()*0.15);
        else
            return 0;
    }
}
