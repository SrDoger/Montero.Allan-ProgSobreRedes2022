/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Sr_Doger(Allan)
 */
public class Resoluciones {

    Texto texto = new Texto();
    Escritura sys = new Escritura();
    Lectura lector = new Lectura();

    public Resoluciones() {

    }

    /**
     * se ingresan 2 datos(valor de las horas y Horas trabajadas), devolviendo
     * el sueldo.
     */
    public void punto1A() {

        float valorHoras, HsTrabajadas;
        sys.println("Ingresar valor de las horas de trabajo");
        valorHoras = lector.leerFloat();
        sys.println("Ingresar Cantidad de horas trabajadas");
        HsTrabajadas = lector.leerFloat();

        float sueldo = valorHoras * HsTrabajadas;

        sys.println("El valor del sueldo bruto es: $" + sueldo);
    }

    /**
     * se ingresan 2 angulos interiores de un triangulo y se devuelve el
     * faltante.
     */
    public void punto1B() {
        float angulo1, angulo2;

        sys.println("Ingresar valor del primer angulo interior");
        angulo1 = lector.leerFloat();
        sys.println("Ingresar valor del segundo angulo interior");
        angulo2 = lector.leerFloat();

        float angulo = (180 - (angulo1 + angulo2));

        if (angulo > 180) {
            sys.println("El valor del tercer angulo interior es: " + angulo);
        } else {
            sys.println("No pueden ser los angules mayores a 180º");
        }

    }

    /**
     * Se ingresa el area de un cuadrado y se devuelve el perimetro.
     */
    public void punto1C() {
        double area, perimetro;

        sys.println("Ingresar M^2 de un cuadrado");
        area = lector.leerFloat();
        perimetro = 4 * (Math.sqrt(area));

        sys.println("El perimetro del cuadrado es: " + perimetro + "M");

    }

    /**
     * Se ingresa un grado Fahrenheit y se convierte a Celsius.
     */
    public void punto1D() {
        float Fahrenheit, Celsius;

        sys.println("Ingresar grados Fahrenheit");
        Fahrenheit = lector.leerFloat();

        Celsius = ((Fahrenheit - 32) / 1.8f);

        sys.println("La convercion es: " + Celsius + "C");

    }

    /**
     * Se ingresa una cantidad de segundos y se devuelve su cantidad en dias,
     * horas, minutos, segundos.
     */
    public void punto1E() {
        int temp, dias = 0, horas = 0, minutos = 0, segundos = 0, segundosincial;

        sys.println("ingresar una determinanda cantidad de timepo en segundos");
        segundosincial = lector.leerInt();

        temp = segundosincial;

        while (true) {

            if (86400 <= temp) {
                dias++;
                temp -= 86400;
            } else if (3600 <= temp) {
                horas++;
                temp -= 3600;
            } else if (60 <= temp) {
                minutos++;
                temp -= 60;
            } else {
                segundos = temp;
                break;

            }

        }

        sys.println("Los segundos: " + segundosincial + " equivalen a: ");
        sys.println("Dias: " + dias);
        sys.println("Horas: " + horas);
        sys.println("Minutos: " + minutos);
        sys.println("Segundos: " + segundos);
    }

    /**
     * Se ingresa el precio de un producto y se elige el plan para pagarlo.
     */
    public void punto1F() {
        float precio, contado, cuotas;
        int opcion;

        sys.println("Insertar precio del producto");
        precio = lector.leerFloat();

        sys.println("Plan 1: 100% al contado. Se hace el 10% de descuento sobre el precio publicado.");
        sys.println("Plan 2: 50% al contado y el resto en 2 cuotas iguales. El precio publicado se incrementa en un 10%.");
        sys.println("Plan 3: 25% al contado y el resto en 5 cuotas iguales. El precio publicado se incrementa en un 15%.");
        sys.println("Plan 4: Totalmente financiado en 8 cuotas. El 60% se\n"
                + "reparte en partes iguales en las primeras 4 cuotas y el resto\n"
                + "se reparte en partes iguales en las últimas 4 cuotas. El precio\n"
                + "publicado se incrementa en un 25%.");
        sys.println("Seleccione un plan: ");
        opcion = lector.leerInt();

        switch (opcion) {
            case 1:
                precio *= .9;
                sys.println("Se pagara al contado con un descuento del 10% de: $" + precio);
                break;
            case 2:
                precio *= 1.1;
                contado = precio * .5f;
                cuotas = contado / 2;
                sys.println("El precio al contado es: $" + contado + "\nY se pagara en dos cuotas iguales de: $" + cuotas);
                break;
            case 3:
                precio *= 1.15;
                contado = precio / .25f;
                precio *= .75;
                precio /= 5;
                sys.println("Se pagara al contado: $" + contado + "\nY se pagaran en 5 cuotas iguales " + precio);
                break;
            case 4:
                float cuotatemp = precio;
                precio *= 1.2;
                cuotas = precio / 4;
                sys.println("Las primeros 4 cuotas son de: $" + cuotatemp
                        + "\nLas otras 4 son de : $" + cuotas);
                break;

        }

    }

    /**
     * Se ingresa el signo zodiacal del usuario y se hace una aproximacion de la
     * fecha de nacimiento.
     */
    public void punto1G() {

        sys.println("Ingrese su signo zodiacal");
        String signo = lector.leer(), fecha;
        switch (signo.strip().toLowerCase()) {
            case "aries":
                fecha = "21 de marzo — 19 de abril";
                break;
            case "tauro":
                fecha = "20 de abril — 21 de mayo";
                break;
            case "geminis":
                fecha = "21 de mayo — 20 de junio";
                break;
            case "cancer":
                fecha = "21 de junio — 22 de julio";
                break;
            case "leo":
                fecha = "23 de julio — 22 de agosto";
                break;
            case "virgo":
                fecha = "23 de agosto — 22 de septiembre";
                break;
            case "libra":
                fecha = "23 de septiembre — 22 de octubre";
                break;
            case "escorpio":
                fecha = "23 de octubre — 21 de noviembre";
                break;
            default:
                fecha = "No se pudo encontrar la fecha";
                break;
        }

        sys.println("La fecha de nacimiento del usuario es: " + fecha);
    }

    ///////////////////////////////////////
    /**
     * Se ingresan 3 apellidos y se ordenan.
     */
    public void punto2A() {
        ArrayList<String> apellidos = new ArrayList<>();
        sys.println("Ingresar 3 apellidos");
        apellidos.add(lector.leer());
        apellidos.add(lector.leer());
        apellidos.add(lector.leer());
        Collections.sort(apellidos);
        sys.println("Los apellidos ingresados se ordenaron de la siguente manera:"
                + apellidos.get(0) + " ,"
                + apellidos.get(1) + " ,"
                + apellidos.get(2)
        );

    }

    /**
     * Se ingresan 4 numeros y se ordenan.
     */
    public void punto2B() {
        ArrayList<Float> nums = new ArrayList<>();
        int i;
        sys.println("ingresar 4 numeros reales");
        for (i = 0; i <= 3; i++) {
            nums.add(lector.leerFloat());
        }
        Collections.sort(nums);
        sys.println("Esta es la lista ordenada: ");
        for (i = 0; i <= 3; i++) {
            sys.print(String.valueOf(nums.get(i)));
            sys.print(" ");
        }
        sys.println("\n");
    }

    /**
     * El numero ingresado se muestra si un numero es par o impar.
     */
    public void punto2C() {
        sys.println("Ingresar numero para averiguar si es par o impar");
        int temp = lector.leerInt();
        if ((temp % 2) == 0) {
            sys.println("El numero es par");
        } else if ((temp % 2) == 1) {
            sys.println("El numero es impar");
        } else {
            sys.println("Error, no se identifica si es par o impar");
        }
    }

    /**
     * Ingresa 2 datos y divide al mayor con el menor y comprueba si es posible
     * la division.
     */
    public void punto2D() {
        sys.println("Ingrese 2 numeros y la computadora indica si el mayor es divisible por el menor.");
        float resultado, valor1 = lector.leerFloat(), valor2 = lector.leerFloat();
        if (valor1 == 0 && valor2 == 0) {
            sys.println("No se puede divir entre 0, el resultado es indeterminado");
        } else if (valor2 == 0) {
            sys.println("El resultado es infinito");
        } else if (valor1 > valor2) {
            resultado = valor1 / valor2;
            sys.println("Si es divisible, el resultado es: " + resultado);
        } else {
            resultado = valor2 / valor1;
            sys.println("Si es divisible, el resultado es: " + resultado);
        }

    }

    /**
     * Se ingresa el dia y el mes, se devuelve su signo zodiacal.
     */
    public void punto2E() {
        int month, day;

        sys.println("Ingresar mes de nacimiento");
        month = lector.leerInt();
        sys.println("Ingresar dia de nacimiento");
        day = lector.leerInt();

        if ((month == 12 && day >= 22 && day <= 31) || (month == 1 && day >= 1 && day <= 19)) {
            sys.println("Capricornio");
        } else if ((month == 1 && day >= 20 && day <= 31) || (month == 2 && day >= 1 && day <= 17)) {
            sys.println("Acuario");
        } else if ((month == 2 && day >= 18 && day <= 29) || (month == 3 && day >= 1 && day <= 19)) {
            sys.println("Piscis");
        } else if ((month == 3 && day >= 20 && day <= 31) || (month == 4 && day >= 1 && day <= 19)) {
            sys.println("Aries");
        } else if ((month == 4 && day >= 20 && day <= 30) || (month == 5 && day >= 1 && day <= 20)) {
            sys.println("Tauro");
        } else if ((month == 5 && day >= 21 && day <= 31) || (month == 6 && day >= 1 && day <= 20)) {
            sys.println("Geminis");
        } else if ((month == 6 && day >= 21 && day <= 30) || (month == 7 && day >= 1 && day <= 22)) {
            sys.println("Cancer");
        } else if ((month == 7 && day >= 23 && day <= 31) || (month == 8 && day >= 1 && day <= 22)) {
            sys.println("Leo");
        } else if ((month == 8 && day >= 23 && day <= 31) || (month == 9 && day >= 1 && day <= 22)) {
            sys.println("Virgo");
        } else if ((month == 9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22)) {
            sys.println("Libra");
        } else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21)) {
            sys.println("Escorpio");
        } else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21)) {
            System.out.println("Sagitario");
        } else {
            sys.println("Fecha ilegal");

        }

    }

    /**
     * Se ingresan nombre y apellido de 2 personas, mostrando el que tenga el
     * apellido mas largo.
     */
    public void punto2F() {
        String nombre1, nombre2, apellido1, apellido2;

        sys.println("Ingresar el primer nombre");
        nombre1 = lector.leer();
        sys.println("Ingresar el primer apellido");
        apellido1 = lector.leer();

        sys.println("Ingresar el segundo nombre");
        nombre2 = lector.leer();
        sys.println("Ingresar el segundo apellido");
        apellido2 = lector.leer();

        if (apellido1.length() < apellido2.length()) {
            sys.println("El apellido '" + apellido1 + "' es mas largo que '" + apellido2 + "'");
        } else if (apellido1.length() > apellido2.length()) {
            sys.println("El apellido '" + apellido1 + "' es mas largo que '" + apellido2 + "'");

        } else if (apellido1.length() == apellido2.length()) {
            sys.println("Los apellidos son igual de largos (" + apellido1 + " ," + apellido2 + ")");
        } else {
            sys.println("Ocurrio algo inesperado");
        }
    }

    /**
     * Se ingresa un numero natural y se muestran toda su tabla de multiplicar.
     */
    public void punto2G() {
        int i = 1, num;

        sys.println("Ingresar un numero natural");
        num = lector.leerInt();

        sys.println("Su tabla de multiplicar es:");
        while (true) {
            i++;
            num *= i;
            sys.println(String.valueOf(num));
            sys.println(", ");
        }
    }

    /**
     * Se ingresa un numero natural y se verifica si es par o impar.
     */
    public void punto2H() {
        sys.println("Ingresar numero para averiguar si es par o impar");
        int temp = lector.leerInt();
        if ((temp % 2) == 0) {
            sys.println("El numero es par");
        } else if ((temp % 2) == 1) {
            sys.println("El numero es impar");
        } else {
            sys.println("Error, no se identifica si es par o impar");
        }
    }

    ///////////////////////////////////////
    /**
     * 4
     * Se crea un archivo .txt en donde se guarda un tado.
     */
    public void punto3A() {
        int[] numeros = new int[9];
        char[] numerosChar = new char[99];
        for (int i = 48; i < 58; i++) {
            numerosChar[i] = (char) i;
            System.out.println(numerosChar[i]);
        }
        Ficheros archivo = new Ficheros("", "archivo.txt");
        sys.println("ingresar un dato para almacenarlo en un archivo.txt");
        String dato = lector.leer();
        archivo.guardarArchivo(dato);
    }

    /**
     * cada numero guardado se separa en un renglon.
     */
    public void punto3B() {
        Ficheros archivo = new Ficheros("", "archivo.txt");
        sys.println("ingresar un dato para almacenarlo en un archivo.txt");
        String dato = lector.leer();
        archivo.guardarArchivo(dato);
        //to do 
    }

    /**
     * Almacena solo los numeros pares en un archivo.
     */
    public void punto3C() {
        Ficheros archivo = new Ficheros("", "archivo.txt");

        for (int i = 0; i < 1000; i++) {
            if ((i % 2) == 0) {
                archivo.guardarArchivo(String.valueOf(i));
            }
        }

    }

    public void punto3D() {
    }

    public void punto3E() {
    }

    public void punto3F() {
    }

    public void punto3G() {
    }

    public void punto3H() {
    }
}
