/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author Mau
 */
public class Actividad {
    public String categoria;

    
    public String nombreActividad;
    public String descripcionActividad;
    public String horaInicio;
    public String horaFin;
    public boolean prioridad;
    public String fechaInicio;
    public String fechaFin;
    public boolean actividadConcluida;
    
    public Actividad(String categoria,String nombreActividad,String descripcionActividad,
                     String horaInicio,String horaFin,String fechaInicio,
                     String fechaFin,boolean prioridad){
        
        this.categoria            = categoria;
        this.nombreActividad      = nombreActividad;
        this.descripcionActividad = descripcionActividad;
        this.horaInicio           = horaInicio;
        this.horaFin              = horaFin;
        this.fechaInicio          = fechaInicio;
        this.fechaFin             = fechaFin;
        this.prioridad            = prioridad;
        actividadConcluida        = false;
    }
    
    //Setters y Getters
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public String getDescripcionActividad() {
        return descripcionActividad;
    }

    public void setDescripcionActividad(String descripcionActividad) {
        this.descripcionActividad = descripcionActividad;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public boolean isPrioridad() {
        return prioridad;
    }

    public void setPrioridad(boolean prioridad) {
        this.prioridad = prioridad;
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

    public boolean isActividadConcluida() {
        return actividadConcluida;
    }

    public void concluirActividad() {
        this.actividadConcluida = true;
    }

    public boolean verificarConcluido(){
        return actividadConcluida==true;
    }
    
    public void pintar(){
        //rellenar cuando se definan los colores a usar.
    }
}
