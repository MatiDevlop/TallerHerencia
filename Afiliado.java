/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica;

/**
 *
 * @author CltControl
 */
public class Afiliado {
    private String nombres;
    private String apellidos;
    private String cedula;
    private int edad;
    private int aportaciones;
    private double salario;

    public Afiliado(String nombres, String apellidos, String cedula, int edad, int aportaciones, double salario) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.edad = edad;
        this.aportaciones = aportaciones;
        this.salario = salario;
    }

    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getAportaciones() {
        return aportaciones;
    }
    public void setAportaciones(int aportaciones) {
        this.aportaciones = aportaciones;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nombres= " + nombres + ", Apellidos= " + apellidos + ", Cédula= " + cedula + ", Edad= " + edad + ", Aportaciones= " + aportaciones + ", Salario= " + salario;
    }
    @Override
    public boolean equals(Object o){
        if(this==o)
            return true;
        if(o==null)
            return false;
        if(this.getClass()!=o.getClass())
            return false;
        Afiliado a=(Afiliado)o;
        return this.nombres.equals(a.nombres) && this.apellidos.equals(a.apellidos) && this.cedula.equals(a.cedula) && this.aportaciones==a.aportaciones && this.edad==a.edad && this.salario==a.salario;
    }
    public boolean jubilar(){
        return this.edad>=65;
    }
    public double pension(){
        if(jubilar()){
            return (this.salario*(this.aportaciones/500))+(this.salario*0.05);
        }
        else
            return 0;
    }
}
