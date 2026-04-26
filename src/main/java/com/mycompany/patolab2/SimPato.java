package com.mycompany.patolab2;
public class SimPato{
public static void main(String[] args){
    PatoSenuelo ps1 = new PatoSenuelo();
    PatoDeGoma pg1 = new PatoDeGoma();
    PatoCabezaRoja pcr1 = new PatoCabezaRoja();
    PatoReal pr1 = new PatoReal();
        pr1.mostrar();
        pr1.realizarCuaqueo();
        pr1.realizarVuelo();
        pr1.nadar();

        System.out.println();
    }
    
}
