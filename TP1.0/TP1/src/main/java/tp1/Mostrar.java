/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.io.PrintStream;

/**
 *
 * @author Software-Notebook
 */
public class Mostrar {

    PrintStream ps;

    public Mostrar() {
        ps = new PrintStream(System.out);
    }
/**
 * muestra el texto ingresado por pantalla
 * @param texto 
 */
    public void mostrar(String texto) {
        ps.println(texto);
    }

}
