/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author localuser
 */
public class Sistema {

    Sistema() {
    }
    
   /**
    * 
    * @param novolatil
    * @param resultados
    * @param error 
    */

    public void calcular(Ficheros novolatil, Ficheros resultados, Ficheros error) {

        Lectura lector = new Lectura();
        float volatil[] = new float[5];

        for (int i = 0; i <= 4; i++) {
            String temp = lector.leer();
            volatil[i] = (Integer.parseInt(temp));
            novolatil.guardarArchivo(temp);
        }

        for (int i = 0; i <= 4; i++) {
            float numero1 = volatil[i], numero2 = volatil[i + 1];
            try {
                resultados.guardarArchivo(String.valueOf(volatil[i] / (volatil[i + 1] - 3)));
            } catch (ArithmeticException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.WARNING, String.valueOf(numero1) + "/" + String.valueOf(numero2) + " = INDEFINIDO ");   
            }
        }
    }
}
