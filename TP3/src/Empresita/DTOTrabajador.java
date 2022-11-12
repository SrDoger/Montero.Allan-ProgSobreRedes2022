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
public class DTOTrabajador extends Persona{
    private int salario,horasTrabajo, id;
    private String oficio;

    public DTOTrabajador(int salario, int horasTrabajo, int id, String oficio, String nombre, String sexo, int edad, int dni) {
        super(nombre, sexo, edad, dni);
        this.salario = salario;
        this.horasTrabajo = horasTrabajo;
        this.id = id;
        this.oficio = oficio;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

   
}
