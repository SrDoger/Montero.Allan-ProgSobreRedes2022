/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP11;

class Texto {

    Escritura sys = new Escritura();
    Lectura lector = new Lectura();

    public Texto() {
    }

    public String menu() {
        sys.println(
                "Seleccione una de las opciones para continuar:\n"
                + "- 1 - Operacion Aritmetica\n"
                + "- 0 - para Salir del programa");
        return lector.leer();
    }
/**
 * Se elige la opcion Aritmetica que el usuario desee.
 * @return 
 */
    public String seleccion() {
        sys.println(
                "Ingrese uno de los siguientes caracteres para hacer la operacion aritmetica\n"
                + "- + - Sumar\n"
                + "- - - Restar\n"
                + "- * - Multiplicarn\n"
                + "- / - Dividir\n");

        return lector.leer();
    }
/**
 * Devuelve un error.
 */
    public void invalido() {
        sys.println("El dato ingresado no es valodo");
        sys.println("Vuelva a intentar: \n\n");
    }
/**
 * se le pide al usuario ingresar los datos por consola.
 * @return 
 */
    public float ingresarNumero() {
        sys.println("ingrese un numero");
        return lector.leerFloat();
    }
/**
 * Muestra el resultado de la cuenta.
 * @param valor 
 */
    public void resultado(float valor) {
        sys.println("El resultado de la operacion aritmetica es:" + valor);
    }

}
