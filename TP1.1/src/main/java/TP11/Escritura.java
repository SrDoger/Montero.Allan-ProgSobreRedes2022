/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP11;

import java.io.PrintStream;

/**
 *
 * @author localuser
 */
public class Escritura {
    
    protected PrintStream Ps;

    public void print(String texto) {

        Ps = new PrintStream(System.out);

        Ps.print(texto);

    }
        public void println(String texto) {

        Ps = new PrintStream(System.out);

        Ps.println(texto);

    }

}
