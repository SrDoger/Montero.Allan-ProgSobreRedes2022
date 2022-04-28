package guia1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ficheros {

    File archivo;
    String nombre;
    String direccion;
    PrintStream ps;

    /**
     * Crea un archivo en una direccion determinada Ademas se verifica si existe
     *
     * @param direccion
     * @param nombre
     */
    public Ficheros(String direccion, String nombre) {
        ps = new PrintStream(System.out);
        archivo = new File(direccion + nombre);
        if (!archivo.exists()) {

            System.out.println("Se creo el archivo: '" + nombre + "'");
        } else {
            System.out.println("Existe el archivo: '" + nombre + "'");
        }

    }

    /**
     * Guarda un archivo de String en el archivo
     *
     * @param texto
     */
    public void guardarArchivo(String texto) {

        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);

            bw.write(texto);
            bw.newLine();
            bw.flush();

        } catch (IOException ex) {
            Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }

                if (bw != null) {
                    bw.close();
                }

            } catch (IOException ex) {
                Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
