/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julia
 */
public class NodoDoblePrioridad {
    
    private NodoDoblePrioridad ant;
    private NodoDoblePrioridad sig;
    private char dato;
    private int prioridad;

    public NodoDoblePrioridad(char dato, int prioridad) {
        this.ant = null;
        this.sig = null;
        this.dato = dato;
        this.prioridad = prioridad;
    }
        
    public NodoDoblePrioridad getAnt() {
        return ant;
    }

    public void setAnt(NodoDoblePrioridad ant) {
        this.ant = ant;
    }

    public NodoDoblePrioridad getSig() {
        return sig;
    }

    public void setSig(NodoDoblePrioridad sig) {
        this.sig = sig;
    }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
    //orden al mostrar la lista  
    @Override
    public String toString(){
        return "Dato: " + dato + " , Prioridad: " + prioridad;
    }
      
}
