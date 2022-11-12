/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresita;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Software-Notebook
 */
public class Sistemita implements Serializable{
textos texto = new textos();
    public Sistemita() {
        
        DAOProducto tablaCliente = new DAOProducto();

        for (DTOProducto a : tablaCliente.obtenerTodo()) {
            a.getNombre();
        }

    }

    public void menuPrincipal() {
        

        while (true) {
            int subvalor = texto.menu();
            if (subvalor == 0) {
                break;
            } else {
                texto.subMenu(subvalor);
            }
        }
    }

    public void serializar(String archivo) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream(archivo);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(this);
        oos.close();
    }

    public Sistemita deSerializar(String archivo) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(archivo);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Sistemita s = (Sistemita) ois.readObject();
        return s;
    }
    
    public void prender() {
        // aca vamos a hacer un menu
        boolean corriendo = true;
        
        while( corriendo )
        {
            //Utilidades.mostrarMenu();
            texto.menu();
            texto.subMenu(1);    
        }
        System.out.println("Cerrando...");
              
    }
}
