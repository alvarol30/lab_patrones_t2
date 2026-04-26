package com.mycompany.patolab2;
public class SimPato{
public static void main(String[] args){
    //creo los objetos de lls patos
    PatoSenuelo ps1 = new PatoSenuelo();
    PatoDeGoma pg1 = new PatoDeGoma();
    PatoCabezaRoja pcr1 = new PatoCabezaRoja();
    PatoReal pr1 = new PatoReal();
    
    //llamamos a los objetos con sus metodos
    //PATO REAL
    pr1.mostrar();
    pr1.realizarCuaqueo();
    pr1.realizarVuelo();
    pr1.nadar();
    System.out.println();
    
    //PATO DE GOMA
    pg1.mostrar();
    pg1.realizarCuaqueo();
    pg1.realizarVuelo();
    pg1.nadar();
    System.out.println();
    
    //PATO SEÑUELO
    ps1.mostrar();
    ps1.realizarCuaqueo();
    ps1.realizarVuelo();
    ps1.nadar();
    System.out.println();
    
    //PATO DE CABEZA ROJA
    pcr1.mostrar();
    pcr1.realizarCuaqueo();
    pcr1.realizarVuelo();
    pcr1.nadar();
    System.out.println();
    }
    
}
