/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresita;

import java.io.IOException;

/**
 *
 * @author allan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sistemita s = new Sistemita();
        String archivo = "datos.bin";
        try {
            s = s.deSerializar(archivo);
            System.out.println("VIEJO");
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("NUEVO");
        } finally {
            s.prender();
        }

        try {
            s.serializar(archivo);
        } catch (IOException ex) {
            System.out.println("ERROR: No se pudo Serializar.");
        }

    }
}

