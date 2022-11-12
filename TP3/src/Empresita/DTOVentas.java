/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresita;

import java.sql.Date;
import java.util.HashSet;

/**
 *
 * @author allan
 */
public class DTOVentas implements DTOGeneral{
    private Date fecha;
    private int id;
    HashSet<DTOProducto> productos = new HashSet<DTOProducto>();

    public DTOVentas(Date fecha, int id) {
        this.fecha = fecha;
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashSet<DTOProducto> getProductos() {
        return productos;
    }

    public void setProductos(HashSet<DTOProducto> productos) {
        this.productos = productos;
    }
    
    
    public void addProducto(DTOProducto p){
        this.productos.add(p);
    }
    public void delProducto(DTOProducto p){
        this.productos.remove(p);  
    }
}
