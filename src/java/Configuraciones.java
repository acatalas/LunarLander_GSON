
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ale
 */
public class Configuraciones {
    private List<Configuracion> configuraciones;
    
    public Configuraciones(){
        configuraciones = new ArrayList<>();
    }
    
    public void addConfiguracion(Configuracion configuracion){
        configuraciones.add(configuracion);
    }

    public List<Configuracion> getConfiguraciones() {
        return configuraciones;
    }

    public void setConfiguraciones(List<Configuracion> configuraciones) {
        this.configuraciones = configuraciones;
    }

    @Override
    public String toString() {
        String result = "Configuraciones{[\n";
        for (Configuracion configuracion : configuraciones){
            result += configuracion.toString() + "\n";
        }
        result+= "]}";
        return result;
    }
    
}
