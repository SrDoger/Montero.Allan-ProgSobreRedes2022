package guia1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author localuser
 */
public class ClaseEjerciciosIO {

    int opcion = 0;

    Resoluciones resolucion = new Resoluciones();

    public ClaseEjerciciosIO() {
    }

    /**
     * Es una lista con los ejericicios a elegir.
     */
    public void ResolucioEjercicio1() {

        switch (resolucion.texto.opcion("1")) {
            case 1:
                resolucion.punto1A();
                break;
            case 2:
                resolucion.punto1B();
                break;
            case 3:
                resolucion.punto1C();
                break;
            case 4:
                resolucion.punto1D();
                break;
            case 5:
                resolucion.punto1E();
                break;
            case 6:
                resolucion.punto1F();
                break;
            case 7:
                resolucion.punto1G();
                break;
            default:
                resolucion.texto.sys.println("Ejercicio no encontrado");
                break;
        }
    }

    /**
     * Es una lista con los ejericicios a elegir.
     */
    public void ResolucioEjercicio2() {

        switch (resolucion.texto.opcion("2")) {

            case 1:
                resolucion.punto2A();
                break;
            case 2:
                resolucion.punto2B();
                break;
            case 3:
                resolucion.punto2C();
                break;
            case 4:
                resolucion.punto2D();
                break;
            case 5:
                resolucion.punto2E();
                break;
            case 6:
                resolucion.punto2F();
                break;
            case 7:
                resolucion.punto2G();
                break;
            case 8:
                resolucion.punto2H();
                break;
            default:
                resolucion.texto.sys.println("Ejercicio no encontrado");
                break;
        }

    }

    /**
     * Es una lista con los ejericicios a elegir.
     */
    public void ResolucioEjercicio3() {
        switch (resolucion.texto.opcion("3")) {
            case 1:
                resolucion.punto3A();
                break;
            case 2:
                resolucion.punto3B();
                break;
            case 3:
                resolucion.punto3C();
                break;
            case 4:
                resolucion.punto3D();
                break;
            case 5:
                resolucion.punto3E();
                break;
            case 6:
                resolucion.punto3F();
                break;
            case 7:
                resolucion.punto3G();
                break;
            default:
                resolucion.texto.sys.println("Ejercicio no encontrado");

                break;
        }

    }
}
