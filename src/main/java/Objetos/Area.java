/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.ArrayList;

/**
 *
 * @author Mau
 */
public class Area {
    
    private int IDArea;
    private String nombre;
    ArrayList<SubArea> listaSubareas;
    
    public Area(String nombre, int ID){
        listaSubareas = new ArrayList<SubArea>();
        this.nombre = nombre;
        this.IDArea = ID;
    }

    public int getIDArea() {
        return IDArea;
    }

    public void setIDArea(int IDArea) {
        this.IDArea = IDArea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
