import java.io.*;
import java.util.*;

public class NombresOrdenados {

    public static void agregarNombresAArchivo(String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Ingrese un nombre (o 'salir' para terminar): ");
                String nombre = scanner.nextLine();
                if (nombre.equalsIgnoreCase("salir")) {
                    break;
                }
                writer.write(nombre);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ocurrio un error al escribir en el archivo: " + e.getMessage());
        }
    }

    public static void leerYOrdenarNombres(String nombreArchivo) {
        List<String> nombres = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String nombre;
            while ((nombre = reader.readLine()) != null) {
                nombres.add(nombre);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }

        Collections.sort(nombres);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (String nombre : nombres) {
                writer.write(nombre);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
        }
    }
}