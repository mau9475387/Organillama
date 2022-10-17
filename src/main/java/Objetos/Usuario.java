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
public class Usuario {
    ArrayList<Area> Areas;
    ArrayList<Actividad> actividadesNormales;
    private int ID;
    private String nombre;
    private String contraseña;
    private String cumpleaños;
    
    public Usuario(int ID,String nombre, String contraseña,String cumpleaños){
       this.ID = ID;
       this.nombre = nombre;
       this.contraseña = contraseña;
       this.cumpleaños = cumpleaños;
       Areas = new ArrayList<Area>();
       Areas.add(new Area("Salud",1));
       Areas.add(new Area("Deporte",2));
       Areas.add(new Area("Trabajo",3));
       Areas.add(new Area("Educacion",4));
    }
    
}
