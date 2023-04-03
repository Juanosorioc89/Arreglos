/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PROBOOK440
 */
public class Personas {
    
    private String nombre;
    private int edad;

    Personas [] personas = new Personas[4];
    Personas Persona2;
    
    public Personas(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Personas() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", edad=" + edad + ", personas=" + personas + ", Persona2=" + Persona2 + '}';
    }
    
   
    
    
}

