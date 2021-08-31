/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.mascotas.abstrat;

/**
 *
 * @author User
 */
public abstract class Herviboro {
    private String alimentacion;

    public Herviboro() {
        this.alimentacion = "vegetales";
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }
    
}
