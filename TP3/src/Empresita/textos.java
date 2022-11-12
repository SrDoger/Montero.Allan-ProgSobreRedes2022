/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresita;

/**
 *
 * @author allan
 */
public class textos {

    Lectura lector = new Lectura();

    public int menu() {
        System.out.println(
                  "---------------------------------------------"
                + "-----------Que se desea modificar------------"
                + "---------------------------------------------"
                + "- 0 - Salir \n"
                + "- 1 - Trabajador "
                + "- 2 - Producto  "
                + "- 3 - Venta ");

        return 1;
    }

    public int subMenu(int i) {
        String vec[] = new String[2];

        vec[0] = "Trabajador";
        vec[1] = "Producto";
        vec[2] = "Venta";

        String valor = vec[i];

        System.out.println(
                  "--------------------------"
                + "-----------BDD------------"
                + "--------------------------"
                + "- 0 - Volver \n"
                + "- 1 - Añadir " + valor + " \n"
                + "- 2 - Eliminar  " + valor + "  \n"
                + "- 3 - mostar " + valor + "  \n"
                + "- 4 - Actualizar " + valor);

        return Integer.valueOf(lector.leer());
    }
}
