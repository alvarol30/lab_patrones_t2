package com.mycompany.patolab2;
public abstract class Pato{
    protected Volable volable;
    protected Cuaqueable cuaqueable;
    
    public Pato(){}
    public void setVolable(Volable fb){
        this.volable= fb;
    }
    public void setCuaqueable(Cuaqueable qb){
        this.cuaqueable= qb;
    }
    protected abstract void mostrar();
    public void realizarVuelo(){
        
    }
    
    public void realizarCuaqueo(){
        
    }
    
    public void nadar(){
        System.out.println("TODOS LOS PATOS NADAN");
    }
    
}
