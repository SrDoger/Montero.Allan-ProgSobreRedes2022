/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lectura {

    InputStreamReader is;
    BufferedReader br;
    PrintStream ps;

    public Lectura() {

        is = new InputStreamReader(System.in);
        br = new BufferedReader(is);

        ps = new PrintStream(System.out);
    }

    /**
     * Lee los datos que se le ingresan por pantalla
     * @return
     */
    public String leer() {
        String texto = "";
        try {
            texto = br.readLine().trim();
        } catch (IOException ex) {
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return texto;
    }

}
