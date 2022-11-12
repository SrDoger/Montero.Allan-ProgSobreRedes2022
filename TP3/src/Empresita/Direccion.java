/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresita;

/**
 *
 * @author allan
 */
public class Direccion {

    private String Localidad, Calle;
    private int NumCalle, Departamento;

    public Direccion(String Localidad, String Calle, int NumCalle, int Departamento) {
        this.Localidad = Localidad;
        this.Calle = Calle;
        this.NumCalle = NumCalle;
        this.Departamento = Departamento;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public int getNumCalle() {
        return NumCalle;
    }

    public void setNumCalle(int NumCalle) {
        this.NumCalle = NumCalle;
    }

    public int getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(int Departamento) {
        this.Departamento = Departamento;
    }

}
