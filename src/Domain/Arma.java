/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author nacho
 */
public abstract class Arma {
        
    protected float daño;

    public Arma(float daño) {
        this.daño = daño;
    }

    public float getDaño() {
        return daño;
    }

    public void setDaño(float daño) {
        this.daño = daño;
    }
    
    
    
    
}
