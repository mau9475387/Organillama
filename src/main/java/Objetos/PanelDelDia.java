package Objetos;

import java.util.ArrayList;

public class PanelDelDia {
    public ArrayList<String> horasDeSueño;
    public ArrayList<String> horasDeComida;
    public ArrayList<Actividad> actividadesNormales;
    private String nombreDelDia;

    
    public PanelDelDia(String nombreDelDia){
        this.nombreDelDia   = nombreDelDia;
        horasDeSueño        = new ArrayList<String>();
        horasDeComida       = new ArrayList<String>();
        actividadesNormales = new ArrayList<Actividad>();
        
    }
    
    //Setters y Getters
    public String getNombreDelDia() {
        return nombreDelDia;
    }

    public void setNombreDelDia(String nombreDelDia) {
        this.nombreDelDia = nombreDelDia;
    }
    
    //añadir y vaciar
    
    public void añadirHorasDeSueño(String horasDeSueño){
        this.horasDeSueño.add(horasDeSueño);
    }
    
    public void borrarHorasDeSueño(){
        this.horasDeSueño.removeAll(horasDeSueño);
    }
    
    public void añadirHorasDeComida(String horasDeComida){
        this.horasDeComida.add(horasDeComida);
    }
    
    public void borrarHorasDeComida(){
        this.horasDeComida.removeAll(horasDeComida);
    }
    
    public void añadirActividad(Actividad a){
        actividadesNormales.add(a);
    }
    
    public void concluirActividad(String nombreActividad){//se cambiara la entrada a id de la actividad cuando se haya desarrollado un generador de ID
        boolean encontrado = false;
        for(int i=0;i<actividadesNormales.size() || encontrado==true;i++){
            if(actividadesNormales.get(i).getNombreActividad().equals(nombreActividad)){
                actividadesNormales.get(i).concluirActividad();
                encontrado=true;
            }
        }
    }
    
    public void borrarActividad(String nombreActividad){//se cambiara la entrada a id de la actividad cuando se haya desarrollado un generador de ID
        boolean encontrado = false;
        for(int i=0;i<actividadesNormales.size() || encontrado==true;i++){
            if(actividadesNormales.get(i).getNombreActividad().equals(nombreActividad)){
                actividadesNormales.remove(i);
                encontrado=true;
            }
        }
    }
}
