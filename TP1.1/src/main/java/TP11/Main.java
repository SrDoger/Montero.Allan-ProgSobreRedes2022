package TP11;

/**
 *
 * @author Sr_Doger
 */
public class Main {

    public static void main(String[] args) {

        Calculos resolucion = new Calculos();
        Texto texto = new Texto();
        String valor;
        boolean bucle = true;

        while (bucle) {
            valor = texto.menu();
            if (valor.compareTo("1") == 0) {
                texto.resultado(resolucion.SeleccionOperacionAritmetica(texto.ingresarNumero(), texto.ingresarNumero()));
            } else if (valor.compareTo("0") == 0) {
                bucle = false;
            } else {
                resolucion.texto.invalido();
            }

        }
    }
}
