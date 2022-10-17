
package Objetos;

import java.util.ArrayList;

public class Proyecto {
    ArrayList<Actividad> actividades;
    private int ID;
    public String nombre;
    public String fechaInicio;
    public String fechaFin;
    public String colorProyecto; //modificar
    public boolean permiteChoques;
    
    public Proyecto(int ID,String nombre,String fechaInicio, String fechaFin,
                    String colorProyecto,boolean pChoques,ArrayList<Actividad> actividades){
        this.nombre = nombre;
        this.fechaInicio    = fechaInicio;
        this.fechaFin       = fechaFin;
        this.colorProyecto  = colorProyecto;
        this.permiteChoques = pChoques;
        this.actividades    = actividades;
        this.ID=ID;
    }
    
    //setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getColorProyecto() {
        return colorProyecto;
    }

    public void setColorProyecto(String colorProyecto) {
        this.colorProyecto = colorProyecto;
    }

    public boolean isPermiteChoques() {
        return permiteChoques;
    }

    public void setPermiteChoques(boolean permiteChoques) {
        this.permiteChoques = permiteChoques;
    }
    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
