/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica;

/**
 *
 * @author CltControl
 */
public class Practica {

    public static void main(String[] args) {
        AfiliadoDomestico ad1=new AfiliadoDomestico("Luis Adrian", "Villon Macias", "987654321", 65, 500, 700,4, "123456789");
        System.out.println(ad1);
        System.out.println("¿El empleado "+ad1.getNombres()+" se puede jubilar? "+ad1.jubilar()+". Entonces su pensión será "+ad1.pension());
        Afiliado af=ad1;
        System.out.println();
        System.out.println(af);
        System.out.println("¿El afiliado "+af.getNombres()+" se puede jubilar bajo las condiciones de Afiliado Doméstico? "+af.jubilar()+". Entonces su pensión será "+af.pension());
        
        AfiliadoCampesino ac1=new AfiliadoCampesino("Luis Adrian", "Villon Macias", "987654321", 65, 500, 700,80);
        System.out.println(ac1);
        System.out.println("¿El empleado "+ac1.getNombres()+" se puede jubilar? "+ac1.jubilar()+". Entonces su pensión será "+ac1.pension());
        Afiliado afi=ac1;
        System.out.println();
        System.out.println(afi);
        System.out.println("¿El afiliado "+afi.getNombres()+" se puede jubilar bajo las condiciones de Afiliado Campesino? "+afi.jubilar()+". Entonces su pensión será "+afi.pension());
        
        Afiliado afiliado=new AfiliadoDomestico("Pablo Emilio", "Escobar Gaviria", "123456789", 75, 800, 10000, 4, "147852369");
        System.out.println(afiliado);
        AfiliadoDomestico ad=(AfiliadoDomestico) afiliado;
        System.out.println("¿El afiliado "+ad.getNombres()+" se puede jubilar bajo las condiciones de Afiliado Doméstico? "+ad.jubilar()+". Entonces su pensión será "+ad.pension());
        System.out.println(ad.getCed_empleador());
        System.out.println();
        
        Afiliado afiliado2=new AfiliadoCampesino("Pablo Emilio", "Escobar Gaviria", "123456789", 75, 800, 10000, 400);
        System.out.println(afiliado2);
        AfiliadoCampesino ac=(AfiliadoCampesino) afiliado2;
        System.out.println("¿El afiliado "+ac.getNombres()+" se puede jubilar bajo las condiciones de Afiliado Doméstico? "+ac.jubilar()+". Entonces su pensión será "+ac.pension());
        System.out.println(ac.getHectareas());
        System.out.println();
        
        Afiliado a=new Afiliado("Ruben Leonel", "Aguirre Montiel", "369852147", 84, 300, 700);
        System.out.println(a);
        System.out.println("¿El afiliado "+a.getNombres()+" se puede jubilar? "+a.jubilar()+". Entonces su pensión será "+a.pension());
       
    }   
}
