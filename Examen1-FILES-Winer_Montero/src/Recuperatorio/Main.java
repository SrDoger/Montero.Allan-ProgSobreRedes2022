package Recuperatorio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author localuser
 */
public class Main {

    public static void main(String[] args) throws IOException {
        //Ficheros ficheros = new Ficheros("C:\\Users\\localuser\\Desktop\\", "datos.csv");
        FlujoDeDatos fdd = new FlujoDeDatos();
        Producto p = new Producto();


        File datos = fdd.crearTxt("datos.csv");
        fdd.escribirTxt(datos, "nombre;marca;cantidad;precio");
//        ficheros.guardarArchivo("ola");
                //Aca creamos productos
                //Producto p1 = new Producto( "Lavandina","Ziff",2,300 );
        boolean continuar = true;
        while (continuar) {
            fdd.escribir("Ingrese una opcion:");
            fdd.escribir("- 1 - Agregar un producto");
            fdd.escribir("- 2 - Mostrar todos los productos");
            fdd.escribir("- 3 - Calcular Stock");
            //falta completar este punto nada mas
            fdd.escribir("- 4 - Salir");

            int opt = parseInt(fdd.leer());
            switch (opt) {
                case 1:
                    fdd.escribir( "" ); 
                    p.crearProducto();
                    p.mostrarDatos();
                    fdd.escribirTxt(datos, p.devolverProducto());
                    
                    fdd.escribir( "" );
                    break;
                case 2: {
                    fdd.escribir( "" );
                    try {
                        fdd.escribir(fdd.LeerFileConBuffer(datos));
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                fdd.escribir( "" );
                break;
                case 3: {
                    Funciones fun = new Funciones();
                    String stock = fun.calcularStock(datos);
                    fdd.escribir( stock );
                }
                break;
                case 4:
                    fdd.escribir(
                            "\nSALIENDO\n"
                            + ".\n.\n.\n."
                    );
                    continuar = false;
                    break;

            }
        }
    }
}
