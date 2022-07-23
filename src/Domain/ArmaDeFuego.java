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
public class ArmaDeFuego extends Arma{
    
    protected double cadencia;
    protected int municion;

    public ArmaDeFuego(double cadencia, int municion, float daño) {
        super(daño);
        this.cadencia = cadencia;
        this.municion = municion;
    }

    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) {
        this.municion = municion;
    }

    public double getCadencia() {
        return cadencia;
    }

    public void setCadencia(double cadencia) {
        this.cadencia = cadencia;
    }
    
    
}
