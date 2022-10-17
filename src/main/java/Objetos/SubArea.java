/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class SubArea {
    private String nombre;
    private String color;
    ArrayList<Proyecto> listaProyectos;
    private int IDSubarea;
    
    public SubArea(int ID, String nombre){
       listaProyectos = new ArrayList<Proyecto>();
       this.IDSubarea = ID;
       this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public Proyecto getProyecto(int ID){
        Proyecto res = null;
            for(int i=0;i<listaProyectos.size() && res == null;i++){
                if(listaProyectos.get(i).getID() == ID){
                    res = listaProyectos.get(i);
                }
            }
        return res;
    }
   
}
