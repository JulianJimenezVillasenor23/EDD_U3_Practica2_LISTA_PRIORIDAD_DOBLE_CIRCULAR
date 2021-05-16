/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julia
 */
public class ListaDobleCircularPrioridad  extends ListaDobleCircular{
    
    public ListaDobleCircularPrioridad(){
        super();
    }
    
    @Override
    public boolean insertar(char dato, int prioridad){
        //insertar  lista doble circular
        if(!super.insertar(dato, prioridad)){
            return false;
        }
        // nodo doble prioridad, dar orden a la prioridad 
        if(fin.getPrioridad() == fin.getPrioridad()){
            return true;
        }
        //nodo doble circular, dar orden ala prioridad
        if(fin.getPrioridad() > ini.getPrioridad()){
            fin = fin.getAnt();
            ini = ini.getAnt();
            return true;
        }
        
        //variable aux para controlar valores ingresados
        NodoDoblePrioridad aux = fin.getAnt();
        while(fin.getPrioridad() > aux.getPrioridad()){
            aux = aux.getAnt();
        }
        fin.setSig(aux.getSig());
        ini.setAnt(fin.getAnt());
        fin.getAnt().setSig(ini);
        fin.setAnt(aux);
        aux.getSig().setAnt(fin);
        aux.setSig(fin);
        fin = ini.getAnt();
        return true;
    }
}
