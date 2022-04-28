/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

/**
 *
 * @author localuser
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ClaseEjerciciosIO resolucion = new ClaseEjerciciosIO();

        Texto texto = new Texto();

        String valor;
        boolean bucle = true;

        while (bucle) {

            valor = texto.menu();

            if (valor.compareTo("1") == 0) {
                resolucion.ResolucioEjercicio1();
            } else if (valor.compareTo("2") == 0) {
                resolucion.ResolucioEjercicio2();
            } else if (valor.compareTo("3") == 0) {
                resolucion.ResolucioEjercicio3();
            } else if (valor.compareTo("4") == 0) {
                bucle = false;
            } else {
                texto.invalido();
            }
        }
    }

}
