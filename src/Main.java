public class Main {
    public static void main(String[] args) {

        String nombreArchivo = "nombres.txt";
        NombresOrdenados.agregarNombresAArchivo(nombreArchivo);
        NombresOrdenados.leerYOrdenarNombres(nombreArchivo);
        System.out.println("Los nombres han sido ordenados y guardados en " + nombreArchivo);
    }
}
