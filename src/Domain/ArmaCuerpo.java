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
public class ArmaCuerpo extends Arma{
    protected int durabilidad;
    protected double velocidad;

    public ArmaCuerpo(int durabilidad, double velocidad, float daño) {
        super(daño);
        this.durabilidad = durabilidad;
        this.velocidad = velocidad;
    }

    public int getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(int durabilidad) {
        this.durabilidad = durabilidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    
    
}
