/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repolab2_gustavopineda;

/**
 *
 * @author Usuario
 */
public class Universidades {
    private String nombre;
    private String nombreRector;
    private String sucursal;
    private int añoCreacion;
    private int numMaestros;
    private int numEstudiantes;
    private int costMensual;
    private String nivel;

    public Universidades() {
    }

    public Universidades(String nombre, String nombreRector, String sucursal, int añoCreacion, int numMaestros, int numEstudiantes, int costMensual, String nivel) {
        this.nombre = nombre;
        this.nombreRector = nombreRector;
        this.sucursal = sucursal;
        this.añoCreacion = añoCreacion;
        this.numMaestros = numMaestros;
        this.numEstudiantes = numEstudiantes;
        this.costMensual = costMensual;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreRector() {
        return nombreRector;
    }

    public void setNombreRector(String nombreRector) {
        this.nombreRector = nombreRector;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public int getAñoCreacion() {
        return añoCreacion;
    }

    public void setAñoCreacion(int añoCreacion) {
        this.añoCreacion = añoCreacion;
    }

    public int getNumMaestros() {
        return numMaestros;
    }

    public void setNumMaestros(int numMaestros) {
        this.numMaestros = numMaestros;
    }

    public int getNumEstudiantes() {
        return numEstudiantes;
    }

    public void setNumEstudiantes(int numEstudiantes) {
        this.numEstudiantes = numEstudiantes;
    }

    public int getCostMensual() {
        return costMensual;
    }

    public void setCostMensual(int costMensual) {
        this.costMensual = costMensual;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Universidad(" + "nombre=" + nombre + ", nombreRector=" + nombreRector + ", sucursal=" + sucursal + ", añoCreacion=" + añoCreacion + ", numMaestros=" + numMaestros + ", numEstudiantes=" + numEstudiantes + ", costMensual=" + costMensual + ", nivel=" + nivel + '9';
    }
    
    
}
