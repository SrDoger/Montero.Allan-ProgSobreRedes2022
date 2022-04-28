package guia1;

/**
 *
 * @author Sr_Doger
 */
class Texto {

    Escritura sys = new Escritura();
    Lectura lector = new Lectura();

    public Texto() {
    }

    /**
     * Es un menu y el usuario selecciona que opcion va a elegir.n
     *
     * @return
     */
    public String menu() {
        sys.println(
                "Seleccione una de las siguentes opcioens\n"
                + "- 1 - Ejercicio 1\n"
                + "- 2 - Ejercicio 2\n"
                + "- 3 - Ejercicio 3\n"
                + "- 4 - Salir del programa");

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
     * Selecciona un ejercicio y lo ejecuta.
     *
     * @param ejercicio
     * @return
     */
    public int opcion(String ejercicio) {
        sys.print("Ejercicio ");
        sys.println(ejercicio);
        sys.println("Seleccionar punto");
        int temp = lector.leerInt();
        return temp;
    }

}
