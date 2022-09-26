/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDL;

public class ListaDE<E> {
    private NodoDE<E> inicio, fin;
    
    public ListaDE(){
        inicio = null;
        fin = null;
    }
    
    /**Verifica si es vacia la lista*/
    public boolean vacia(){
        return inicio == null && fin == null;
    }
    
    /**Devuelve el tamaño de la lista*/
    public int tamaño(){
        int contador=0;
        for(NodoDE<E> x = inicio; x!= null ; x = x.getSig()){
            contador++;
        }
        return contador;
    }
    
    /**Inserta un dato al inicio de la lista*/
    public void insertarInicio(E dato){
        NodoDE<E> nuevo = new NodoDE<E>(dato);
        if (vacia()){
            fin = nuevo;
        }else{
            nuevo.setSig(inicio);
            inicio.setAnt(nuevo);
        }
        inicio = nuevo;
    }
    
    /**inserta un dato al final de la lista*/
    public void add(E dato){
        NodoDE<E> nuevo = new NodoDE<E>(dato);
        if(vacia()){
           inicio = nuevo; 
        }else{
            fin.setSig(nuevo);
            nuevo.setAnt(fin);
        }
        fin = nuevo;
    }
    
    /**Elimina el primer elemento de la lista*/ 
    public E eliminarInicio(){
        E res = null;
        if(!vacia()){
            res = inicio.getDato();
            if(inicio == fin)   inicio=fin=null;
            else{
                inicio = inicio.getSig();
                inicio.setAnt(null);
            }
        }
        return res;
    }
    
    public void eliminar(E dato){
        if(vacia()){
           
        }else{
            NodoDE<E> x = inicio;
            while(x!=null && dato!=x.getDato()){
                x=x.getSig();
            }
            if(x!= null){
                
                x.getAnt().setSig(x.getSig());
                if(x.getSig()!= null)   x.getSig().setAnt(x.getAnt());
            }
        }
    }
    
    /**Elimina el último elemento de la lista*/
    public E eliminarFin(){
        E res = null;
        if(!vacia()){
            res = fin.getDato();
            if(inicio == fin) inicio = fin = null;
            else{
                fin = fin.getAnt();
                fin.setSig(null);
            }
        }
        return res;
    }
    
    /**Devuelve un elemento en la posicion dada*/
    public E obtenerPos(int pos){
        NodoDE<E> x=inicio;
        return obtenerPos(pos,x);
    }
    private E obtenerPos(int pos, NodoDE<E> x){
        if(vacia())return null;
        if(pos==0) return x.getDato();
        return obtenerPos(pos-1,x.getSig());
    }
    
    
    
    /**Elimina un elemento de la lista, dada su posición*/
    public E eliminarPos(int pos){
        if(pos==0)  return eliminarInicio(); //si pos es 0, se elimina el primer elemento de la lista.
        if(pos==tamaño()-1) return eliminarFin();//si pos es igual a la cantidad de elementos existentes, se elimina el ultimo elemento.
        else{
            NodoDE<E> x = inicio;
            while(x!=null && pos !=0){
                x = x.getSig();
                pos--;
            }
            E res = null;
            if(x!= null){
                res = x.getDato();
                x.getAnt().setSig(x.getSig());
                if(x.getSig()!= null)   x.getSig().setAnt(x.getAnt());
            }
            return res;
        }
    }
    
    /**Verifica si existe algun elemento similar al dato de entrada*/
    public boolean buscarSiExiste(E d){
        NodoDE<E> x=inicio;
        while(x!=null && !x.getDato().equals(d)){
            x = x.getSig();
        }
        return x !=null;
    }
    
    
    
    
    
    /**Devuelve todos los elementos de la lista en formato String*/
    public String toString(){
        String res = "";
        for (NodoDE<E> x = inicio; x!=null; x=x.getSig()){
            res = res + x.getDato() + " // ";
        }
        return res;
    }    
}