/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.LinkedList;

/**
 *
 * @author Soft-02
 */
public class Funciones {

    public Funciones() {
    }

    public String restructurado() throws IOException {
        Ficheros archivo = new Ficheros("C:\\Users\\Soft 10\\Desktop\\", "juegos.dat");
        String texto = archivo.leerFileCaracterAcaractet(new File("C:\\Users\\Soft 10\\Desktop\\juegos.dat"));
        archivo.eliminar();
        System.out.println(texto);
        Ficheros error = new Ficheros("C:\\Users\\Soft 10\\Desktop\\", "crash.log");

        archivo.guardarArchivo(texto);
        return texto;
    }

    public String mostrarvictorias(String texto) {

        LinkedList<String> lista = new LinkedList<String>();
        char caracter;
        int i = 0;
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        while (i == 100) {

            i++;
            lista.add(texto.split("\n")[i]);
            System.out.println(lista.get(i));
        }
        
        return texto;

    }
}
