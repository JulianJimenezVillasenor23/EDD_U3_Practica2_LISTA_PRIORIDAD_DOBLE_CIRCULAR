/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julia
 */
public class ListaDoble {
    protected NodoDoblePrioridad ini, fin;
    
    public ListaDoble(){
        ini = fin=null;
    }
     
    public boolean insertar(char dato, int prioridad){
        if(ini == null){
            ini = fin = new NodoDoblePrioridad(dato, prioridad);
            return true;
        }
        if(ini == fin){
            fin= new NodoDoblePrioridad(dato, prioridad);
            ini.setSig(fin);
            fin.setAnt(ini);
            return true;
        }
        fin.setSig(new NodoDoblePrioridad(dato, prioridad));
        fin.getSig().setAnt(fin);
        fin = fin.getSig();
        return true;
    }
    
    public boolean eliminar(){
        if(fin == null){
            return false;
        }
        if(ini == fin){
            ini = fin = null;
            return true;
        }
        ini = ini.getSig();
        ini.getAnt().setSig(null);
        ini.setAnt(fin);
        return true;
    }
    
    @Override
    public String toString(){
        return mostrar(fin);
    }

    private String mostrar(NodoDoblePrioridad most) {
        if(most == ini){
            //formato al mostrar la lista 
            return String.format("%s\n", most.getAnt(), most , most.getSig());        
        }
        //se retorna la lista para mostrarla
        return mostrar(most.getAnt()) + String.format("%s\n", most.getAnt(), most, most.getSig());
    }
    
}
