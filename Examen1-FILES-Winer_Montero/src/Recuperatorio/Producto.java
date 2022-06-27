/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recuperatorio;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

/**
 *
 * @author localuser
 */
public class Producto {

    FlujoDeDatos fdd = new FlujoDeDatos();

    String nombre, marca;
    int cantidad;
    float precio;

    public Producto(String nombre, String marca, int cantidad, float precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    public Producto(){};

    public void crearProducto() {
        fdd.escribir("Ingrese nombre:");
        this.nombre = fdd.leer();
        fdd.escribir("Ingrese marca:");
        this.marca = fdd.leer();
        fdd.escribir("Ingrese cantidad:");
        this.cantidad = parseInt(fdd.leer());
        fdd.escribir("Ingrese precio:");
        this.precio = parseFloat(fdd.leer());
    }

    public void mostrarDatos() {
        fdd.escribir( "\t===PRODUCTO===" );
        fdd.escribir("\tNombre: " + this.nombre);
        fdd.escribir("\tMarca: " + this.marca);
        fdd.escribir("\tCantidad: " + this.cantidad);
        fdd.escribir("\tPrecio: " + this.precio);
        fdd.escribir( "\t==============" );
    }
    public String devolverProducto(){
        String text = (this.nombre + ";" + this.marca + ";" + this.cantidad + ";" + this.precio);
        return text;
    }
}
