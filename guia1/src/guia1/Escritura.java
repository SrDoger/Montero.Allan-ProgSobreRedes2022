/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.io.PrintStream;

/**
 *
 * @author Sr_Doger
 */
public class Escritura {

    protected PrintStream Ps;

    /**
     * Escribe los datos en la pantalla
     *
     * @param texto
     */
    public void print(String texto) {

        Ps = new PrintStream(System.out);

        Ps.print(texto);

    }

    /**
     * Escribe los datos en la pantalla
     *
     * @param texto
     */
    public void println(String texto) {

        Ps = new PrintStream(System.out);

        Ps.println(texto);

    }

}
