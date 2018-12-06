/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ale
 */
class Configuracion {
    private String nombre;
    private String nave;
    private boolean modoDificil;
    
    public Configuracion(String nombre, String nave, boolean modoDificil){
        this.nombre = nombre;
        this.nave = nave;
        this.modoDificil = modoDificil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoNave() {
        return nave;
    }

    public void setTipoNave(String tipoNave) {
        this.nave = tipoNave;
    }

    public boolean isModoDificil() {
        return modoDificil;
    }

    public void setModoDificil(boolean modoDificil) {
        this.modoDificil = modoDificil;
    }

    @Override
    public String toString() {
        return "{" + "nombre=" + nombre + ", nave=" + nave + ", modoDificil=" + modoDificil + '}';
    }
    
    
}
