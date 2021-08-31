/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.mascotas;

import udem.edu.co.mascotas.abstrat.Herviboro;

/**
 *
 * @author User
 */
public class Conejo extends Herviboro{
    
    private int extremidades;
    private String color;
    private String nombre;

    public Conejo(int extremidades, String color, String nombre) {
        this.extremidades = extremidades;
        this.color = color;
        this.nombre = nombre;
    }

    public int getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(int extremidades) {
        this.extremidades = extremidades;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
