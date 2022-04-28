/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP11;

/**
 *
 * @author Sr_Doger
 */
public class Calculos {

    String valor;
    float valor3;
    Texto texto = new Texto();
/**
 * Se le ingresan dos valores y se devuelve un resultado.
 * @param valor1
 * @param valor2
 * @return 
 */
    public float SeleccionOperacionAritmetica(float valor1, float valor2) {
        valor = texto.seleccion();
        if (valor.compareTo("+") == 0) {
            valor3 = valor1 + valor2;
        } else if (valor.compareTo("-") == 0) {
            valor3 = valor1 - valor2;
        } else if (valor.compareTo("*") == 0) {
            valor3 = valor1 * valor2;
        } else if (valor.compareTo("/") == 0) {
            valor3 = valor1 / valor2;
        } else {
            texto.invalido();
        }
        return valor3;
    }

}
