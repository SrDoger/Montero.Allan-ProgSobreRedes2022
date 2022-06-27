package Recuperatorio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author localuser
 */
public class Funciones {

    ArrayList<Producto> listaProductos = new ArrayList<>();
    FlujoDeDatos fdd = new FlujoDeDatos();
    public Funciones() {

    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }
    public String formatear( String textoBase ){
        String textoFinal = textoBase.replace( ";","-" );
        
        return textoFinal;
    }
    public String calcularStock(File f) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        
        
        int contador = 0;

        String linea = "", texto = "", aux = "";
        while ((linea = br.readLine()) != null) {
            String vec[] = linea.split(";");
            for(String valor: vec){
                fdd.escribir2( valor + ";");
                
            }
            
            contador++;
        }

        br.close();
        fr.close();
        return texto;

    }
}
