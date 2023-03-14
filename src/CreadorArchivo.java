import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreadorArchivo {

    public static void main(String[] args) throws IOException {
        System.out.print(CreadorArchivo.creador(args[0], args[1]));

    }

    public static String creador(String rutaDestino, String contenido) throws IOException {
        Path p = Paths.get(rutaDestino);
        if (!Files.exists(p)) {
            Files.writeString(p, contenido);

            System.out.println("Archivo creado con éxito");

        } else {
            System.out.println("Error: el archivo ya existe");
        }
        return "Operación finalizada";
     }

}
