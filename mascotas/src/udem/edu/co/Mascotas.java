/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co;

import java.util.ArrayList;
import java.util.List;

import udem.edu.co.interfaces.Animal;
import udem.edu.co.mascotas.Conejo;
import udem.edu.co.mascotas.Gato;
import udem.edu.co.mascotas.Perro;

/**
 *
 * @author User
 */
public class Mascotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal max = new Perro();
        Animal abc = new Gato();
        Animal pol = new Conejo();
        
        List <Animal> animales = new ArrayList();
        
        animales.add(max);
        animales.add(abc);
        animales.add(pol);
        
        for(Animal animal:animales){
            System.out.println(animal.toString());
        }
    }
}
