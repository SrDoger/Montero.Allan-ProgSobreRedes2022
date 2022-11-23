/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP21;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Sr_Doger
 * 
 */
public class DataBase implements Serializable {
    private static final long serialVersionUID = -1000L;
    private List<Cliente> bUsuario;
    public DataBase() {
        bUsuario = new LinkedList<>();
    }

    /*Métodos base de usuarios*/
    public void agregarUsuario(Cliente c) {
        if (c != null) {
            bUsuario.add(c);
        }
    }

    void mostrarClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  

}
