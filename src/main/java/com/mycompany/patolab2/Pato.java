package com.mycompany.patolab2;
public abstract class Pato{
    protected Volable volable;
    protected Cuaqueable cuaqueable;
    
    public Pato(){
        
    }
    public void setVolable(Volable fb){
        
    }
    public void setCuaqueable(Cuaqueable qb){
        this.cuaqueable= qb;
    }
    public abstract void mostrar();
    
    
}
