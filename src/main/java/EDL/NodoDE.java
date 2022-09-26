/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDL;
public class NodoDE<E> {
    private E dato;
    private NodoDE<E> sig;
    private NodoDE<E> ant;
    
    public NodoDE(E n){
        dato = n ;
        sig = null;
    }
    
    
    public E getDato(){
        return dato;
    }
    
    public void setDato(E x){
        dato = x;
    }
    
    public NodoDE<E> getSig(){
        return sig;
    }
    
    public void setSig(NodoDE<E> x){
        sig = x;
    }
    
    public NodoDE<E> getAnt(){
        return ant;
    }
    
    public void setAnt(NodoDE<E> ant){
        this.ant = ant;
    }    
}

