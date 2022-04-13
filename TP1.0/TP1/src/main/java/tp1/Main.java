/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.io.IOException;

import java.util.Vector;

/**
 *
 * @author localuser
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Lectura lector = new Lectura();
        Mostrar print = new Mostrar();
        int volatil[] = new int[5];
        
        Sistema sis = new Sistema();
        
        Ficheros novolatil = new Ficheros("D:\\Escritorio\\archivos\\", "novolatil.txt");
        Ficheros resultados = new Ficheros("D:\\Escritorio\\archivos\\", "resultados.txt");
        Ficheros error = new Ficheros("D:\\Escritorio\\archivos\\", "error.txt");

        sis.calcular(novolatil, resultados, error);
        
    }
}
